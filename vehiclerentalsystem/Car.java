package com.encapsulationandpolymorphism.vehiclerentalsystem;

class Car extends Vehicle implements Insurable {
    private static final double insuranceRate = 0.05; // 5% of rental rate
    private String policyNumber;

    public Car(int vehicleNumber, String type, double rentalRate, String policyNumber) {
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
        return "Policy Number: " + policyNumber + ", Insurance Rate: 5%";
    }
}
