package com.kodilla.abstracts;

public class Circle extends Shape {
    @Override
    public void giveSurfaceArea() {
        System.out.println("Pole koła wynosi P=Pi*r*r");
        System.out.println("Pi=3,16..");
    }

    @Override
    public void giveCircuit() {
        System.out.println("Obwód koła wynosi Obw=2*Pi*r");
        System.out.println("Pi=3,16..");
    }
}
