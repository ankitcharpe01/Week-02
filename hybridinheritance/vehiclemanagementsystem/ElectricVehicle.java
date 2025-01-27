package com.inheritance.hybridinheritance.vehiclemanagementsystem;

class ElectricVehicle extends Vehicles {
    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void charge() {
        System.out.println("Electric vehicle Charging...");
    }

    @Override
    public void display() {
        System.out.println("Electric vehicle...");
        super.display();
        charge();
    }
}

