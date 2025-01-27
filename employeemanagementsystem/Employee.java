package com.encapsulationandpolymorphism.employeemanagementsystem;

public abstract class Employee implements Department {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId,String name,double baseSalary){
        this.employeeId=employeeId;
        this.name=name;
        this.baseSalary=baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary>=0){
            this.baseSalary = baseSalary;
        }else{
            System.out.println("Invalid! action found");
        }

    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails(){
        System.out.println("Employee Id: "+employeeId);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Base Salary: "+baseSalary);
    }
}
