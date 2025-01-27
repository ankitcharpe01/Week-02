package com.inheritance.assistedproblems.vehicleandtransportsystem;

class Motorcycle extends Vehicle{
    private String color;

    public Motorcycle(double maxSpeed,String fuelType,String color){
        super(maxSpeed,fuelType);
        this.color=color;
    }

    @Override
    public void displayInfo(){
        System.out.println("Maximum Speed of MotorCycle is: "+maxSpeed+" And the fuel type for Motorcycle is "+fuelType);
        System.out.println("Bike color: "+color);
    }
}
