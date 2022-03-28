package com.example.springprofile.service;

import com.example.springprofile.model.AppUser;
import com.example.springprofile.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile(value ={"local","dev","prod"} )
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<AppUser> getUsers(){
        return userRepository.findAll();

    }

}
