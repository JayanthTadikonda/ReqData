package com.jay.SpringMongoRest.controller;

import com.jay.SpringMongoRest.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

class UserControllerTest {

    @Autowired
    private MockMvc mockmvc;

    @MockBean
    public UserController userController;

    @Test
    void getAllUsers() throws Exception {
        User user = new User();
        user.setId(1);
        user.setName("Toby");

        List<User> users = new ArrayList<>();
        users.add(user);

        assertEquals(userController.getAllUsers(), user);
        //given(userController.getAllUsers()).willReturn(users);
    }

    @Test
    void createUsers() {
    }
}