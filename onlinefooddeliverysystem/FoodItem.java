package com.encapsulationandpolymorphism.onlinefooddeliverysystem;

public abstract class FoodItem implements Discountable{
    private String itemName;
    private double price;
    private int quantity;
    private double discount;
    private double totalPrice;

    @Override
    public double getDiscountDetails() {
        return discount;
    }

    @Override
    public void applyDiscount(double discount) {
        setDiscount(discount);
        setTotalPrice(getTotalPrice()-getTotalPrice()*discount/100);
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public abstract void calculateTotalPrice(double extraCharge);
    public abstract void getItemDetails();
}

