package com.encapsulationandpolymorphism.ecommerceplatform;

public abstract class Product implements Taxable {
    private int productId;
    private String name;
    private double price;
    private double tax;
    private double discount;
    private double finalAmount;
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        setPrice(price);
        finalAmount=price;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
    public void setFinalAmount(double finalAmount) {
        this.finalAmount = finalAmount;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        if(price>0)
            this.price = price;
        else
            System.out.println("Enter valid price!");
    }
    public void setProductId(int productId) {

        this.productId = productId;
    }

    public double getFinalAmount() {
        return finalAmount;
    }
    public String getName() {

        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getProductId() {

        return productId;
    }
    public abstract void calculateDiscount(double discount);

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public void calculateTax(double tax) {
        setTax(tax);
        finalAmount+=finalAmount*tax/100;
    }

    @Override
    public double getTaxDetails() {
         return tax;
    }

    public void display(){
        System.out.println("Product name : "+name);
        System.out.println("Product ID : "+productId);
        System.out.println("Product price : "+price);
        System.out.println("Tax : "+tax+"%");
        System.out.println("Discount : "+discount+"%");
        System.out.println("Final amount to pay : "+finalAmount);
    }
}
