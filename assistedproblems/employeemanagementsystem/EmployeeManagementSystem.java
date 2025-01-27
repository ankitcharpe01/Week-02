package com.inheritance.assistedproblems.employeemanagementsystem;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee employee ;
        employee= new Employee(101,"Mr.Ram",40000.0);
        employee.displayDetails();
        System.out.println();
        employee=new Manager(201,"Dr.Smithi",60000.0,8);
        employee.displayDetails();
        System.out.println();
        employee = new Developer(301,"Animesh",30000.0,"Java");
        employee.displayDetails();
        System.out.println();
        employee = new Intern(401,"Abhishek",20000.0,3);
        employee.displayDetails();
    }
}

