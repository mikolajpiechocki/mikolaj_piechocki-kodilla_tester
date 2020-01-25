package com.kodilla.abstracts;

public class Square extends Shape {
    @Override
    public void giveSurfaceArea() {
        System.out.println("Pole kwadratu wynosi P=a*a");
    }
    @Override
    public void giveCircuit() {
        System.out.println("Obwód kwadratu wynosi Obw=a+a+a+a=4*a");
    }
}
