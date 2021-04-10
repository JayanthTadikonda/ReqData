package com.jay.java.FirstSpringRest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.ArrayList;


@RestController
public class UserController {

    @PutMapping(value = "/userId", consumes={MediaType.APPLICATION_JSON_VALUE})
    public User ValidateUser(@Valid @RequestBody User user) {

        boolean status = false;

        User user1 = new User("jack", "jackpass");
        User user2 = new User("becca", "pass");
        User user3 = new User(null,"pass");

        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        users.forEach(System.out::println);

        System.out.println("Entered User Name: " + user.getUserName());
        if(users.contains(user)){
            System.out.println("Valid User");
        } else System.out.println("Invalid User");
//        for (User u : users) {
//            if ((u.getUserName().equalsIgnoreCase(user.getUserName())) && (u.getPassword().equalsIgnoreCase(user.getPassword()))) {
//                System.out.println("Valid User");
//                break;
//            }else
//                System.out.println("Invalid User");
//        }
        return user;
    }
    @PostMapping(value = "/addUser", consumes = MediaType.APPLICATION_JSON_VALUE)
    public User createNewUser(@Valid @RequestBody User user) {
        System.out.println("Entered User Details: " + user.getUserName());

//        ArrayList<User> users = new ArrayList<>();
//        User userNew = new User(user.getUserName(),user.getPassword());
//        users.add(userNew);
        //System.out.println("New User Added " + users.toString());

        return user;
    }
    
    @GetMapping(value="/find{id}")
    public void findUser(@Valid @PathVariable ("id") String id){

        User user1 = new User("jack", "jackpass");
        User user2 = new User("becca", "pass");
        User user3 = new User(null,"pass");

        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);


        if (users.stream().iterator().hasNext()) {
            System.out.println(users);
            throw new ResponseStatusException(HttpStatus.FOUND,"THere is no JACK");
        }
        users.forEach(System.out::println);

    }
    
}
