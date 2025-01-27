package com.inheritance.hybridinheritance.restaurantmanagementsystem;

class Chef extends Persons implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {

        System.out.println("Cooking....");
    }

    @Override
    public void display() {
        System.out.println("Chef...");
        super.display();
        performDuties();
    }
}
