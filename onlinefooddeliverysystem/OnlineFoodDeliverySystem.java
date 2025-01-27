package com.encapsulationandpolymorphism.onlinefooddeliverysystem;

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem item1=new VegItem("Dosa",120,2);
        FoodItem item2=new NonVegItem("Biryani",300,1);
        item1.applyDiscount(10);
        item2.applyDiscount(8);
        int extraChargeOnVegFood=20;
        int extraChargeOnNonVegFood=50;
        item1.calculateTotalPrice(extraChargeOnVegFood);
        item2.calculateTotalPrice(extraChargeOnNonVegFood);
        item1.getItemDetails();
        System.out.println("---------------------------");
        item2.getItemDetails();
    }

}
