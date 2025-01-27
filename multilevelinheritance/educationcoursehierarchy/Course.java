package com.inheritance.multilevelinheritance.educationcoursehierarchy;

class Course{
    private String courseName;
    private int duration;

    public Course(String courseName,int duration){
        this.courseName=courseName;
        this.duration=duration;
    }

    public void displayDetails(){
        System.out.println("Buy! Educational Courses : ");
    }
}
