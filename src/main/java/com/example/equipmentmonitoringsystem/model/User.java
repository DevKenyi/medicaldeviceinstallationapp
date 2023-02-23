package com.example.equipmentmonitoringsystem.model;

import com.example.equipmentmonitoringsystem.enums.Gender;
import com.example.equipmentmonitoringsystem.enums.Profession;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String phoneNumber;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Enumerated(EnumType.STRING)
    private Profession profession;

    //FetchType.LAZY does not work
    @OneToOne (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "healthFacilityId", referencedColumnName = "id")
    private HealthFacility healthFacility;




}
