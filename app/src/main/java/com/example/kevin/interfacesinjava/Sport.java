package com.example.kevin.interfacesinjava;

public abstract class Sport implements LifeInsurance {

    // Instance variables
    private String name;
    private String rules;
    private String uniform;
    private int speedRequired;
    private int powerRequired;


    // Sport Class Constructor
    public Sport(String name, String rules, String uniform, int speedRequired, int powerRequired) {

        this.name = name;
        this.rules = rules;
        this.uniform = uniform;
        this.speedRequired = speedRequired;
        this.powerRequired = powerRequired;
    }




}
