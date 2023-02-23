package com.example.equipmentmonitoringsystem.repo;

import com.example.equipmentmonitoringsystem.model.HealthFacility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthFacilityRepo extends JpaRepository<HealthFacility, Long> {
}
