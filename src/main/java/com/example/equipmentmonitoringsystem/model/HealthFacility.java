package com.example.equipmentmonitoringsystem.model;

import com.example.equipmentmonitoringsystem.enums.MedicalDeviceCategory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class HealthFacility {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String facilityName;
    private String getFacilityAddress;
    @Enumerated(EnumType.STRING)
    private MedicalDeviceCategory medicalDeviceCategory;

}
