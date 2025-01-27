package com.inheritance.hierarchicalinheritance.schoolsystem;

public class SchoolSystem {
    public static void main(String[] args) {
        Student student=new Student("Alice",20,"A");
        Teacher teacher=new Teacher("Frank",45,"Java");
        Staff staff=new Staff("Chef",43,"Library");
        student.display();
        System.out.println("--------------------------------");
        teacher.display();
        System.out.println("--------------------------------");
        staff.display();

    }
}