package com.encapsulationandpolymorphism.vehiclerentalsystem;

public abstract class Vehicle {

    private int vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(int vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract double calculateRentalCost(int days);

    public void displayDetails(){
        System.out.println("Vehicle Number: "+vehicleNumber);
        System.out.println("Vehicle Type: "+type);
        System.out.println("Vehicle Rental rate: "+rentalRate);
    }
}
