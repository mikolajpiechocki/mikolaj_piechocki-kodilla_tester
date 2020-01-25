package com.kodilla.abstracts;

public class Rectangle extends Shape {
    @Override
    public void giveSurfaceArea() {
        System.out.println("Pole prostokąta wynosiP=a*b");
    }

    @Override
    public void giveCircuit() {
        System.out.println("Obwód prostokąta wynosi Obw=2*a+2*b");
    }
}
