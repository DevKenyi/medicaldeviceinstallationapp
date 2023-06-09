package com.example.equipmentmonitoringsystem.controller;

import com.example.equipmentmonitoringsystem.model.User;
import com.example.equipmentmonitoringsystem.repo.UserRepo;
import com.example.equipmentmonitoringsystem.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RequestMapping("api")
@RestController
public class UserController {
    @Autowired
    private UserServiceImp userServiceImp;
    @Autowired
    private UserRepo repo;


    @PostMapping("/user")
    public ResponseEntity<User>saveUser(@RequestBody User user){
        return  userServiceImp.saveUser(user);
    }

    @GetMapping("/user")
    public ResponseEntity<List<User>> getAllUsers(){
        return userServiceImp.listOfUsers();
    }

    @GetMapping("/fetchById/{id}")
    public ResponseEntity<?> fetchPatientById(@PathVariable  Long id) {
        Optional<User> user = repo.findById(id);
        if (user.isPresent()) {
            User patient = user.get();
            return  ResponseEntity.ok(patient);
        }
        else {
            Map<String, String> errorMessage = new HashMap<>();
            errorMessage.put("message","User with the "+ id+" not found");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
        }
    }

}
