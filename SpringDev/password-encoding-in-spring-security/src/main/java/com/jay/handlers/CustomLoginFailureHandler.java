package com.jay.handlers;

import com.jay.entity.CustomerEntity;
import com.jay.security.CustomUserDetailService;
import com.jay.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class CustomLoginFailureHandler extends SimpleUrlAuthenticationFailureHandler {

    @Autowired
    CustomUserDetailService customerService;

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {

        String email = request.getParameter("email");
        CustomerEntity entity = customerService.getByEmail(email);

        if (entity != null) {
            if (entity.isEnabled() && entity.isAccountNonLocked()) {
                if (entity.getFailedAttempt() < customerService.MAX_FAILED_ATTEMPTS - 1) {
                    customerService.increaseFailedAttempts(entity);
                } else {
                    customerService.lock(entity);
                    exception = new LockedException("Your account has been locked due to 3 failed attempts."
                            + " It will be unlocked after 24 hours.");
                }
            } else if (!entity.isAccountNonLocked()) {
                if (customerService.unlockWhenTimeExpired(entity)) {
                    exception = new LockedException("Your account has been unlocked. Please try to login again.");
                }
            }

        }
        super.setDefaultFailureUrl("/login?error");
        super.onAuthenticationFailure(request, response, exception);
    }

}
