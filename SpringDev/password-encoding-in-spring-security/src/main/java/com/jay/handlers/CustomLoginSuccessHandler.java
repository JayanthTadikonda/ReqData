package com.jay.handlers;

import com.jay.entity.CustomerEntity;
import com.jay.security.CustomUserDetailService;
import com.jay.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class CustomLoginSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

    @Autowired
    CustomUserDetailService customerService;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {

        CustomUserDetailService userDetails =  (CustomUserDetailService) authentication.getPrincipal();
        CustomerEntity entity = customerService.getUser();

        if (entity.getFailedAttempt() > 0) {
            customerService.resetFailedAttempts(entity.getEmail());
        }

        super.onAuthenticationSuccess(request, response, authentication);
    }
}
