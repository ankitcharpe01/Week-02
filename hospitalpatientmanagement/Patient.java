package com.encapsulationandpolymorphism.hospitalpatientmanagement;

public abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private String medicalHistory;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = "";
    }

    public abstract double calculateBill();

    public String getPatientDetails() {
        return "ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    public void addRecord(String record) {
        medicalHistory += record + "\n";
    }

    public String viewRecords() {
        return medicalHistory;
    }
}
