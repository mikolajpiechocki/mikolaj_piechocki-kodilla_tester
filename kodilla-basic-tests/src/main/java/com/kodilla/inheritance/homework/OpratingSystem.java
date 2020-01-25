package com.kodilla.inheritance.homework;

public class OpratingSystem {
    private int years;
    public void turnOn() {
        System.out.println("Turned on");
    }
     public void turnOff() {
            System.out.println("Turned off");
    }
    public  OpratingSystem(int years) {
        this.years = years;
        System.out.println("Rok wydania systemu " + years);
    }
    public int getYears() {
        return years;
    }
}
