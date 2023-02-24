package com.example.equipmentmonitoringsystem.service;

import com.example.equipmentmonitoringsystem.model.HealthFacility;
import com.example.equipmentmonitoringsystem.repo.HealthFacilityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HealthFacilityService {
    @Autowired
    private HealthFacilityRepo healthFacilityRepo;

    public ResponseEntity<HealthFacility> saveFacility(HealthFacility healthFacility){
        return new ResponseEntity<>(healthFacilityRepo.save(healthFacility), HttpStatus.OK);
    }

    public ResponseEntity<List<HealthFacility>>listOfFacility(){
        return new ResponseEntity<>(healthFacilityRepo.findAll(), HttpStatus.OK);
    }

}
