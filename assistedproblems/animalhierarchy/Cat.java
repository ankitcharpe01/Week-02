package com.inheritance.assistedproblems.animalhierarchy;

//Driver class Cat
class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    //Override makeSound and display methods
    @Override
    public void makeSound() {
        System.out.println("Cat is makes a sound! Meow...");
    }

    @Override
    public void display() {
        System.out.println("Name of the Cat is: " + super.getName() + "\nAnd Age of the Dog: " + super.getAge());
    }
}
