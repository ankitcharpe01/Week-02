package com.inheritance.assistedproblems.animalhierarchy;

//Base class Animal
class Animal {
    //the Animal class has two fields
    private String name;
    private int age;

    //Initialized name and age
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //create getters for name and age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //method for display the sound of animals
    public void makeSound() {
        System.out.println("Animal makes sound! ");
    }

    //method for display animal details
    public void display() {
        System.out.println("Name of the Animal: " + name + "\nAnd Age of the Animal: " + age);
    }
}