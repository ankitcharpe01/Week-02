package com.encapsulationandpolymorphism.vehiclerentalsystem;

public class Bike extends Vehicle implements Insurable {
    private static final double INSURANCE_RATE = 0.28; // Renamed for consistency
    private String policyNumber;

    // Constructor
    public Bike(int vehicleNumber, String type, double rentalRate, String policyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Policy Number: " + policyNumber);
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * INSURANCE_RATE;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance details: " + (INSURANCE_RATE * 100) + "%";
    }

    // Getter and Setter for policyNumber
    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }
}
