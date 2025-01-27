package com.inheritance.assistedproblems.employeemanagementsystem;

class Employee{
    protected int id;
    protected  String name ;
    protected double salary;

    public Employee(int id ,String name , double salary){
        this.id = id;
        this.name = name;
        this.salary=salary;
    }

    public void displayDetails(){
        System.out.println("Id of the employee is: "+id+"\nName of the employee is: "+name+"\nSalary of the employee is: "+salary);
    }
}