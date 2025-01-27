package com.inheritance.assistedproblems.animalhierarchy;

//Driver class Bird
class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);
    }

    //Overridden methods :
    @Override
    public void makeSound() {
        System.out.println("Bird is Chirping...");
    }

    @Override
    public void display() {
        System.out.println("Name of the Bird is: " + super.getName() + "\nAnd Age of the Bird: " + super.getAge());
    }
}