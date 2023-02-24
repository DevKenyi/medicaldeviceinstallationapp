package com.example.equipmentmonitoringsystem.repo;

import com.example.equipmentmonitoringsystem.model.MedicalDevice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalDeviceRepo extends JpaRepository<MedicalDevice, Long> {
}
