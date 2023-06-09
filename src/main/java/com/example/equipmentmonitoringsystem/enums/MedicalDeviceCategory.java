package com.example.equipmentmonitoringsystem.enums;

public enum MedicalDeviceCategory {
    surgical("SURGICAL"),
     Plants("OXYGEN PLANT"),
    diagnostics("DIAGNOSITICS"),
    radiography("RADIOGRAPHY"),
    neonatal("NEONATAL"),
    others ("Other"),
    ;

    private String deviceNames;

    MedicalDeviceCategory(String deviceNames) {
        this.deviceNames = deviceNames;
    }

    public String getDeviceCategory(){
        return  deviceNames;
    }
}
