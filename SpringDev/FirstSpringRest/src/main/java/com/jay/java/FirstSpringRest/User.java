package com.jay.java.FirstSpringRest;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {

    @NotBlank(message = "Please Enter UserName !")
    @Size(min = 3, message = "Hey you enter MIN 5 chars!!")
    @Pattern(regexp="^[A-Z0-9]{3}",message="length must be 3")
    private String userName;

    @NotBlank
    @Size(min=5, message="Name should have atleast 2 characters")
    private String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
