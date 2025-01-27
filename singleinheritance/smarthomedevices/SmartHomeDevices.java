package com.inheritance.singleinheritance.smarthomedevices;

public class SmartHomeDevices {
    public static void main(String[] args) {
        Device device = new Device(101,"Hot");
        device.displayStatus();
        System.out.println();

        device = new Thermostat(103,"Cooling",75.0);
        device.displayStatus();
        System.out.println();

        device = new Thermostat(104,"Hot",79.0);
        device.displayStatus();

    }
}