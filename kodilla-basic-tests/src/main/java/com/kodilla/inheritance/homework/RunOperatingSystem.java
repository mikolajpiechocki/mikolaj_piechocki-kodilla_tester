package com.kodilla.inheritance.homework;

public class RunOperatingSystem {
    public static void main(String[] args) {
        OpratingSystem opratingSystem = new OpratingSystem(2017);
        opratingSystem.turnOn();
        opratingSystem.turnOff();

        OperatingSystemWersion2 operatingSystemWersion2 = new OperatingSystemWersion2();
        opratingSystem.turnOn();
        opratingSystem.turnOff();

        OperatingSystemWersion3 operatingSystemWersion3 = new OperatingSystemWersion3();
        opratingSystem.turnOn();
        opratingSystem.turnOff();

    }
}
