package com.inheritance.assistedproblems.employeemanagementsystem;

class Intern extends Employee{
    private int projectAssigned;

    public Intern(int id,String name,double salary,int projectAssigned){
        super(id,name,salary);
        this.projectAssigned=projectAssigned;
    }

    @Override
    public void displayDetails(){
        System.out.println("Id of the Intern is: "+id+"\nName of the Intern is: "+name+"\nSalary of the Intern is: "+salary);
        System.out.println("Projects Assigned :"+projectAssigned);
    }
}