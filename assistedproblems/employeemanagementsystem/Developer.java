package com.inheritance.assistedproblems.employeemanagementsystem;

class Developer extends Employee{
    private String programmingLanguage;

    public Developer(int id,String name,double salary,String programmingLanguage){
        super(id,name,salary);
        this.programmingLanguage=programmingLanguage;
    }

    @Override
    public void displayDetails(){
        System.out.println("Id of the Developer is: "+id+"\nName of the Developer is: "+name+"\nSalary of the Developer is: "+salary);
        System.out.println("Programming Language for Develper :"+programmingLanguage);
    }

}