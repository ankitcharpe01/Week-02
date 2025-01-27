package com.inheritance.multilevelinheritance.educationcoursehierarchy;


class OnlineCourse extends Course{
    private String platform;
    private boolean isRecorded;

    public OnlineCourse(String courseName, int duration , String platform,boolean isRecorded) {
        super(courseName, duration);
        this.platform=platform;
        this.isRecorded=isRecorded;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Online Course Platform is: "+platform);
        System.out.println("Is the Lecture is Recorded? "+isRecorded);
    }
}
