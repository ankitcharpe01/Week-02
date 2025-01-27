package com.inheritance.assistedproblems.vehicleandtransportsystem;

public class VehicleAndTransportSystem {
    public static void main(String[] args) {
        Vehicle vehicle;
        vehicle= new Vehicle(95,"Petrol");
        vehicle.displayInfo();
        System.out.println();

        vehicle = new Car(180,"CNG",7);
        vehicle.displayInfo();
        System.out.println();

        vehicle= new Truck(110,"Diesel","Mahindra");
        vehicle.displayInfo();
        System.out.println();

        vehicle=new Motorcycle(300, "Petrol","Black");
        vehicle.displayInfo();
    }
}

