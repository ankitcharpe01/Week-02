package com.encapsulationandpolymorphism.hospitalpatientmanagement;

public class OutPatient extends Patient{
    private String treatmentType;

    public OutPatient(String patientId, String name, int age, String treatmentType) {
        super(patientId, name, age);
        this.treatmentType = treatmentType;
    }

    @Override
    public double calculateBill() {
        if (treatmentType.equals("Consultation")) {
            return 100;
        } else {
            return 200;
        }
    }
}

