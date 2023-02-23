package com.example.equipmentmonitoringsystem.enums;

public enum Profession {
    md("MD"),
    doctor("DOCTOR"),
    biomedicalEng("BIOMEDICAL ENGINEER"),
    technician("TECHNICIAN"),
    other("OTHERS");

    private String portfolio;

    Profession(String portfolio) {
        this.portfolio = portfolio;
    }

    public String getPortfolio(){
        return portfolio;
    }
}
