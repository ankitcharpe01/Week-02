package com.encapsulationandpolymorphism.vehiclerentalsystem;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle v;
        v=new Truck(1001,"Truck" , 450.5, "TRU1001" );
        v.calculateRentalCost(10);
        v.displayDetails();
        System.out.println();
        v=new Car(2001,"Car" , 250.5, "CAR2001" );
        v.calculateRentalCost(11);
        v.displayDetails();
        System.out.println();
        v=new Bike(3001,"Bike" , 150.5, "BUS3001" );
        v.calculateRentalCost(13);
        v.displayDetails();
    }
}
