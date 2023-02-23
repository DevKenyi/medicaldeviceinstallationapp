package com.example.equipmentmonitoringsystem.controller;

import com.example.equipmentmonitoringsystem.model.User;
import com.example.equipmentmonitoringsystem.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api")
@RestController
public class UserController {
    @Autowired
    private UserServiceImp userServiceImp;


    @PostMapping("/user")
    public ResponseEntity<User>saveUser(@RequestBody User user){
        return  userServiceImp.saveUser(user);
    }

    @GetMapping("/user")
    public ResponseEntity<List<User>> getAllUsers(){
        return userServiceImp.listOfUsers();
    }

}
