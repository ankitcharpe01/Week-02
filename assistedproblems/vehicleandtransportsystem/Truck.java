package com.inheritance.assistedproblems.vehicleandtransportsystem;

class Truck extends  Vehicle{
    private String brand;

    public Truck(double maxSpeed,String fuelType,String brand){
        super(maxSpeed,fuelType);
        this.brand=brand;
    }

    @Override
    public void displayInfo(){
        System.out.println("Maximum Speed of Truck is: "+maxSpeed+" And the fuel type for Truck is "+fuelType);
        System.out.println("Truck Brand is: "+brand);
    }
}
