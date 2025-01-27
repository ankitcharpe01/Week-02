package com.encapsulationandpolymorphism.vehiclerentalsystem;

public class Truck extends Vehicle implements Insurable{
    private static final double insuranceRate = 0.1;
    private String policyNumber;

    public Truck(int vehicleNumber, String type, double rentalRate, String policyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * insuranceRate;
    }

    @Override
    public String getInsuranceDetails() {
        return "Policy Number: " + policyNumber + ", Insurance Rate: " + (insuranceRate * 100) + "%";
    }


    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Policy Number: " + policyNumber);
    }
}
