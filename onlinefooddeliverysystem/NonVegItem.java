package com.encapsulationandpolymorphism.onlinefooddeliverysystem;

public class NonVegItem extends FoodItem{
    private double extraCharge;
    public NonVegItem(String itemName, double price, int quantity){
        super(itemName,price,quantity);
    }

    @Override
    public void calculateTotalPrice(double extraCharge) {
        this.extraCharge=extraCharge;
        setTotalPrice(getPrice()*getQuantity());
        setTotalPrice(getTotalPrice()+extraCharge);
        setTotalPrice(getTotalPrice()-getTotalPrice()*getDiscount()/100);
    }

    @Override
    public void getItemDetails() {
        System.out.println("NonVeg Food...");
        System.out.println("FoodItem name : "+getItemName());
        System.out.println("FoodItem price : "+getPrice());
        System.out.println("FoodItem quantity : "+getQuantity());
        System.out.println("Extra charge : "+extraCharge);
        System.out.println("Discount : "+getDiscountDetails()+"%");
        System.out.println("Total Amount to Pay : "+getTotalPrice());
    }
}

