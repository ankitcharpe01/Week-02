package com.inheritance.multilevelinheritance.educationcoursehierarchy;

public class EducationCourseHierarchy {
    public static void main(String[] args) {
        Course course;
        course = new Course("Java Programming",6);
        course.displayDetails();
        System.out.println();

        course = new OnlineCourse("AWS",3,"Skill Builder",true);
        course.displayDetails();
        System.out.println();

        course = new PaidOnlineCourse("Spring Boot",6,"Udemy",false,45000.0,20);
        course.displayDetails();
    }
}

