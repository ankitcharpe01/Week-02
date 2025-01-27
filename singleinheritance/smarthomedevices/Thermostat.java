package com.inheritance.singleinheritance.smarthomedevices;


//Super Class
class Thermostat extends Device{
    private double temperatureSetting;

    public Thermostat(int deviceId,String status,double temperatureSetting){
        super(deviceId,status);
        this.temperatureSetting=temperatureSetting;
    }
    public void displayStatus(){
        super.displayStatus();
        System.out.println("Temperature Setting: "+temperatureSetting);
    }

}
