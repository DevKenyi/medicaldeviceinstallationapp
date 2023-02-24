package com.example.equipmentmonitoringsystem.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class MedicalDevice {
    @Id
    private Long id;
    private String deviceName;
    private String serialNumber;
    private LocalDate dateOfInstallation;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "facility_id")
    @JsonBackReference
   private HealthFacility healthFacility;
}
