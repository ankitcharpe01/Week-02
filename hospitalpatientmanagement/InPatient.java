package com.encapsulationandpolymorphism.hospitalpatientmanagement;

public class InPatient extends Patient{
    private int daysStayed;

    public InPatient(String patientId, String name, int age, int daysStayed) {
        super(patientId, name, age);
        this.daysStayed = daysStayed;
    }

    @Override
    public double calculateBill() {
        return daysStayed * 300;
    }
}
