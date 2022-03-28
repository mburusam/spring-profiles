package com.example.springprofile.controller;

import com.example.springprofile.model.AppUser;
import com.example.springprofile.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.orm.jpa.hibernate.SpringImplicitNamingStrategy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/findAllUsers")
    public List<AppUser> findAllUsers(){
        return userService.getUsers();
    }


}
