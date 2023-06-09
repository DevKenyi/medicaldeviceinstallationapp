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
    @Column(name = "device id")
    private Long id;
    @Column(name = "device name")

    private String deviceName;
    @Column(name = "serial number")

    private String serialNumber;
    @Column(name = "installation date ")
    private LocalDate dateOfInstallation;

    private LocalDate maintenanceDate;
    @Column(name = "equipment status ")
    private String equipmentStatus;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "facility_id")
    @JsonBackReference
   private HealthFacility healthFacility;
}
