package com.inheritance.assistedproblems.vehicleandtransportsystem;

class Vehicle{
    protected double maxSpeed;
    protected String fuelType;

    public Vehicle(double maxSpeed,String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }

    public void displayInfo(){
        System.out.println("Maximum Speed for Vehicle is: "+maxSpeed+" And fuel type for Vehicle is "+fuelType);
    }
}

