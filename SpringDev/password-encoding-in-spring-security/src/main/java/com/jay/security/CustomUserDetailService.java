package com.jay.security;

import com.jay.entity.CustomerEntity;
import com.jay.repository.CustomerRepository;
import com.jay.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Date;

@Configuration

@Service("customUserService")
public class CustomUserDetailService implements UserDetails {

    public static final int MAX_FAILED_ATTEMPTS = 3;

    private static final long LOCK_TIME_DURATION = 24 * 60 * 60 * 1000; // 24 hours

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private  CustomerEntity customerEntity;

    public CustomUserDetailService(CustomerEntity customerEntity) {
        this.customerEntity = customerEntity;
    }


    public void increaseFailedAttempts(CustomerEntity customerEntity) {
        int newFailAttempts = customerEntity.getFailedAttempt() + 1;
        customerRepository.updateFailedAttempts(newFailAttempts, customerEntity.getEmail());
    }

    public void resetFailedAttempts(String email) {
        customerRepository.updateFailedAttempts(0, email);
    }

    public void lock(CustomerEntity customerEntity) {
        customerEntity.setAccountNonLocked(false);
        customerEntity.setLockTime(new Date());

        customerRepository.save(customerEntity);
    }

    public boolean unlockWhenTimeExpired(CustomerEntity customerEntity) {
        long lockTimeInMillis = customerEntity.getLockTime().getTime();
        long currentTimeInMillis = System.currentTimeMillis();

        if (lockTimeInMillis + LOCK_TIME_DURATION < currentTimeInMillis) {
            customerEntity.setAccountNonLocked(true);
            customerEntity.setLockTime(null);
            customerEntity.setFailedAttempt(0);

            customerRepository.save(customerEntity);

            return true;
        }

        return false;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return customerEntity.getPassword();
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    public boolean isAccountNonLocked() {
        return customerEntity.isAccountNonLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    public CustomerEntity getByEmail(String email) {
        return customerRepository.findByEmail(email);
    }

    public CustomerEntity getUser() {
        return customerEntity;
    }

}
