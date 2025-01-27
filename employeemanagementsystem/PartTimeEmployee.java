package com.encapsulationandpolymorphism.employeemanagementsystem;

public class PartTimeEmployee extends Employee{
    private  double fixedSalary;
    private  String department;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, double fixedSalary,String department) {
        super(employeeId, name, baseSalary);
        this.fixedSalary = fixedSalary;
        this.department=department;
    }

    @Override
    public double calculateSalary() {
       return fixedSalary+getBaseSalary();
    }

    @Override
    public void assignDepartment(String department) {
          this.department=department;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fixed Salary is : "+fixedSalary);
        System.out.println("Department is :"+getDepartmentDetails());
        System.out.println("Calculated Salary : "+calculateSalary());
    }

}
