package com.example.equipmentmonitoringsystem.enums;

public enum Profession {
    MD("MD"),
    DOCTOR("DOCTOR"),
BIOMEDICAL_ENGINEER("BIOMEDICAL ENGINEER"),

    TECHNICIAN("TECHNICIAN"),
    OTHERS("OTHERS");

    private String portfolio;

    Profession(String portfolio) {
        this.portfolio = portfolio;
    }

    public String getPortfolio(){
        return portfolio;
    }
}
