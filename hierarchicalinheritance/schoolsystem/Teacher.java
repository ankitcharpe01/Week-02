package com.inheritance.hierarchicalinheritance.schoolsystem;

class Teacher extends Person{
    private String subject;
    public Teacher(String name,int age,String subject){
        super(name, age);
        this.subject=subject;
    }
    public void displayRole(){
        System.out.println("Teacher...");
    }

    @Override
    public void display() {
        displayRole();
        super.display();
        System.out.println("Teaches subject : "+subject);
    }
}
