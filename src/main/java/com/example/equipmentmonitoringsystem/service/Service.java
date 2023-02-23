package com.example.equipmentmonitoringsystem.service;

import com.example.equipmentmonitoringsystem.model.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface Service {
    ResponseEntity<User> saveUser(User user);
    ResponseEntity<List<User>> listOfUsers();
}
