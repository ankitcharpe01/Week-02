package com.encapsulationandpolymorphism.employeemanagementsystem;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee emp =new PartTimeEmployee(101,"Mr.Animesh",20000.0,10000.0,"IT");
        emp.displayDetails();
        System.out.println();

        emp=new FullTimeEmployee(102,"Mr.Ayushmaan",50000.0,20000.0,"Computer science");
        emp.displayDetails();
    }
}
