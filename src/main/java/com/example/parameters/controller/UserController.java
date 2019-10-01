package com.example.parameters.controller;

import com.example.parameters.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    private List<User> userList;

    public UserController() {
        userList = new ArrayList<>();
        userList.add(new User("1", "Fabio"));
        userList.add(new User("2", "João"));
        userList.add(new User("3", "José"));
    }

    

}
