package com.inheritance.hybridinheritance.restaurantmanagementsystem;

class Persons {
    private String name;
    private int id;

    public Persons(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void display() {
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
    }
}
