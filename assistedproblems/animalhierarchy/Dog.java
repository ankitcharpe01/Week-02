package com.inheritance.assistedproblems.animalhierarchy;

//Driver class
class Dog extends Animal {

    public Dog(String name, int age) {
        //invoke parent class constructor
        super(name, age);
    }

    //Override makeSound And Display method of super class
    @Override
    public void makeSound() {
        System.out.println("Animal Dog is Barking...");
    }

    @Override
    public void display() {
        System.out.println("Name of the Dog is: " + super.getName() + "\nAnd Age of the Dog: " + super.getAge());
    }
}
