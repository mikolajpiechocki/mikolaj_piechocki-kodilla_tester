package com.kodilla.inheritance.homework;

public class RunOperatingSystem {
    public static void main(String[] args) {
        OpratingSystem opratingSystem = new OpratingSystem(2017);
        opratingSystem.turnOn();
        opratingSystem.turnOff();

        OperatingSystemVersion2 operatingSystemVersion2 = new OperatingSystemVersion2();
        opratingSystem.turnOn();
        opratingSystem.turnOff();

        OperatingSystemVersion3 operatingSystemVersion3 = new OperatingSystemVersion3();
        opratingSystem.turnOn();
        opratingSystem.turnOff();

    }
}
