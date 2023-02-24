package com.example.equipmentmonitoringsystem.controller;

import com.example.equipmentmonitoringsystem.model.HealthFacility;
import com.example.equipmentmonitoringsystem.repo.HealthFacilityRepo;
import com.example.equipmentmonitoringsystem.service.HealthFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class HealthFacilityController {
    @Autowired
    private HealthFacilityService service;

    @PostMapping("facility")
    public ResponseEntity<HealthFacility> saveFacility(HealthFacility healthFacility){
        return service.saveFacility(healthFacility);
    }
    @GetMapping("facility")

    public ResponseEntity<List<HealthFacility>> listOfFacility(){
        return service.listOfFacility();
    }
}
