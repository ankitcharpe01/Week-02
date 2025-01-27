package com.inheritance.multilevelinheritance.educationcoursehierarchy;


class PaidOnlineCourse extends OnlineCourse{

    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded,double fee,double discount) {
        super(courseName, duration, platform, isRecorded);
        this.discount=discount;
        this.fee=fee;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Fee of the online course is: "+fee);
        System.out.println("Fee Discount: "+discount+" %");
    }
}
