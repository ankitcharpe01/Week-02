package com.inheritance.multilevelinheritance.onlineretailordermanagement;


class ShippedOrder extends Order{
    private long trakkingNumber;


    public ShippedOrder(int orderId, String orderDate,long trakkingNumber) {
        super(orderId, orderDate);
        this.trakkingNumber=trakkingNumber;
    }

    @Override
    public void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Tracking Number is: "+trakkingNumber);
    }
}
