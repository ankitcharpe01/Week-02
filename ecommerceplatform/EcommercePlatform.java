package com.encapsulationandpolymorphism.ecommerceplatform;

import java.util.ArrayList;

public class EcommercePlatform {
    public static void main(String[] args) {
        ArrayList<Product> products=new ArrayList<>();
        Product product=new Electronics(101,"Laptop",100);
        product.calculateTax(10);
        product.calculateDiscount(10);
        products.add(product);
        product=new Clothing(202,"Jeans",3000);
        product.calculateTax(10);
        product.calculateDiscount(10);
        products.add(product);
        product=new Groceries(303,"Dry fruits",900);
        product.calculateTax(10);
        product.calculateDiscount(10);
        products.add(product);
        for(Product productP:products) {
            productP.display();
            System.out.println("-----------------------------");
        }

    }

}
