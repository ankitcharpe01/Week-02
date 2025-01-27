package com.inheritance.assistedproblems.vehicleandtransportsystem;

class Car extends Vehicle{
    private int seatCapacity;

    public Car(double maxSpeed,String fuelType,int seatCapacity){
        super(maxSpeed,fuelType);
        this.seatCapacity=seatCapacity;
    }

    @Override
    public void displayInfo(){
        System.out.println("Maximum Speed of Car is: "+maxSpeed+" And fuel type for Car is "+fuelType);
        System.out.println("Seat Capacity for Car: "+seatCapacity);
    }
}
