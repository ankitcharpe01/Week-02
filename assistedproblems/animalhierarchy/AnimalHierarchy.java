package com.inheritance.assistedproblems.animalhierarchy;

//Main class
public class AnimalHierarchy {
    public static void main(String[] args) {
        //Create an instance of Animal class and pass name and age as args
        Animal animal;
        animal = new Animal("Zebra", 22);
        animal.makeSound();
        animal.display();
        System.out.println();

        //Create Dog class instance
        animal = new Dog("Taffy", 6);
        animal.makeSound();
        animal.display();
        //next line
        System.out.println();

        //Create cat class instance
        animal = new Cat("kittu", 5);
        animal.makeSound();
        animal.display();
        System.out.println();

        //Create Bird class instance
        animal = new Bird("Parrot", 2);
        animal.makeSound();
        animal.display();
    }
}

