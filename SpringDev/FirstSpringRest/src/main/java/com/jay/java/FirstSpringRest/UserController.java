package com.jay.java.FirstSpringRest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.ArrayList;

@RestController
public class UserController {

    @PutMapping(value = "userId", consumes={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public boolean ValidateUser(@RequestBody User user) {

        boolean status = false;

        User user1 = new User("jack", "jackpass");
        User user2 = new User("becca", "pass");

        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);

        System.out.println("Entered User Name: " + user.getUserName());
        for (User u : users) {
            if ((u.getUserName().equalsIgnoreCase(user.getUserName())) && (u.getPassword().equalsIgnoreCase(user.getPassword()))) {
                    status = true;
                    System.out.println("Valid User");
            }else System.out.println("Invalid User");
            break;
        }
        return status;
    }
}
