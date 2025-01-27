package com.inheritance.assistedproblems.employeemanagementsystem;

class Manager extends Employee{
    private int teamSize;

    public Manager(int id,String name,double salary,int teamSize){
        super(id,name,salary);
        this.teamSize=teamSize;
    }

    @Override
    public void displayDetails(){
        System.out.println("Id of the Manager is: "+id+"\nName of the manager is: "+name+"\nSalary of the namager is: "+salary);
        System.out.println("Team size for manager :"+teamSize);
    }

}
