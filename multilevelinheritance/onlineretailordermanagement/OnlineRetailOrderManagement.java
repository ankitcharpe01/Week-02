package com.inheritance.multilevelinheritance.onlineretailordermanagement;


public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        Order order;
        order = new Order(98761,"12/12/2025");
        order.getOrderStatus();
        System.out.println();

        order= new ShippedOrder(98765,"15/02/2025",555666777);
        order.getOrderStatus();
        System.out.println();

        order= new DeliveredOrder(98762,"15/03/2025",555666779,"16/03/2025");
        order.getOrderStatus();
        System.out.println();
    }
}
