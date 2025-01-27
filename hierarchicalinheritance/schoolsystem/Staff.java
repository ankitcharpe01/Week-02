package com.inheritance.hierarchicalinheritance.schoolsystem;

class Staff extends Person{
    private String department;
    public Staff(String name,int age,String department){
        super(name, age);
        this.department=department;
    }
    public void displayRole(){
        System.out.println("Staff...");
    }

    @Override
    public void display() {
        displayRole();
        super.display();
        System.out.println("Works in "+department);
    }
}
