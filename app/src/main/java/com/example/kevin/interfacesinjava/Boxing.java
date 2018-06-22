package com.example.kevin.interfacesinjava;

public class Boxing extends Sport{


    private int punchingPowerRequired;
    private int punchingSpeedRequired;
    private int costOfInsurance;


    //Constructor for boxing class
    public Boxing(String name, String rules, String uniform, int speedRequired, int powerRequired,
                  int punchingPowerRequired, int punchingSpeedRequired, int costOfInsurance) {

        //Initialize the constructor of the super class
        super(name, rules, uniform, speedRequired, powerRequired);

        this.punchingPowerRequired = punchingPowerRequired;
        this.punchingSpeedRequired = punchingSpeedRequired;
        this.costOfInsurance = costOfInsurance;
    }


    public int getPunchingPowerRequired() {
        return punchingPowerRequired;
    }

    public void setPunchingPowerRequired(int punchingPowerRequired) {
        this.punchingPowerRequired = punchingPowerRequired;
    }

    public int getPunchingSpeedRequired() {
        return punchingSpeedRequired;
    }

    public void setPunchingSpeedRequired(int punchingSpeedRequired) {
        this.punchingSpeedRequired = punchingSpeedRequired;
    }


    @Override
    public double evaluateCostOfInsurance() {

        return costOfInsurance;

    }

    @Override
    public String toString() {

        return String.format("%s%n%s: %d%n%s: %d", super.toString(),
                "Punching Power Required", getPunchingPowerRequired(), "Punching Speed Required",
        getPunchingSpeedRequired());

    }
}
