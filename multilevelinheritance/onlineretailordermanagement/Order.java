package com.inheritance.multilevelinheritance.onlineretailordermanagement;


class Order{
    protected int orderId;
    protected String orderDate;

    public Order(int orderId ,String orderDate){
        this.orderId=orderId;
        this.orderDate=orderDate;
    }

    public void getOrderStatus(){
        System.out.println("Order Id : "+orderId+"\nOrder placed on: "+orderDate);
    }
}
