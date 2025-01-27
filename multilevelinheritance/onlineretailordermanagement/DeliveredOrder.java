package com.inheritance.multilevelinheritance.onlineretailordermanagement;


class DeliveredOrder extends ShippedOrder{
    private String deliveryDate;

    public DeliveredOrder(int orderId, String orderDate , long trakkingNumber,String deliveryDate) {
        super(orderId, orderDate,trakkingNumber);
        this.deliveryDate=deliveryDate;
    }

    @Override
    public void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Order Delivered on: "+deliveryDate);
    }
}
