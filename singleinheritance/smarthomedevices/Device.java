package com.inheritance.singleinheritance.smarthomedevices;


//Base Class
class Device{
    private int deviceId;
    private String status;

    public Device(int deviceId,String status){
        this.deviceId=deviceId;
        this.status = status;
    }

    public void displayStatus(){
        System.out.println("Device Id : "+deviceId+" ,Status : "+status);
    }
}
