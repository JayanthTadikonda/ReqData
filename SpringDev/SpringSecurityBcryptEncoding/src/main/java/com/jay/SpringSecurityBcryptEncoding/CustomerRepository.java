package com.jay.SpringSecurityBcryptEncoding;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface CustomerRepository extends JpaRepository < CustomerEntity, Long > {
        CustomerEntity findByEmail(String email);
}
