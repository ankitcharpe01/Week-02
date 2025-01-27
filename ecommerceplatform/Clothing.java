package com.encapsulationandpolymorphism.ecommerceplatform;

public class Clothing extends Product{
    private double discount;
    private int sp;
    public Clothing(int productId, String name, double price){
        super(productId, name, price);
    }

    @Override
    public void calculateDiscount(double discount) {
        setDiscount(discount);
        double amount=getFinalAmount();
        setFinalAmount(amount-amount*(discount)/100);
    }

    @Override
    public void display() {
        System.out.println("Clothing : ");
        super.display();
        }
}
