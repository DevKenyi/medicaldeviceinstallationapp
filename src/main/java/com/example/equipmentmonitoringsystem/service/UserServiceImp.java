package com.example.equipmentmonitoringsystem.service;

import com.example.equipmentmonitoringsystem.model.User;
import com.example.equipmentmonitoringsystem.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@org.springframework.stereotype.Service
public class UserServiceImp implements Service {
    @Autowired
    private UserRepo userRepo;
    @Override
    public ResponseEntity<User> saveUser(User user) {
        return new ResponseEntity<>(userRepo.save(user), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<User>> listOfUsers() {
        return new ResponseEntity<>(userRepo.findAll(), HttpStatus.OK);
    }
}
