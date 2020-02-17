package com.kodilla.collections.interfaces.homework;

import java.util.Random;

public class Tesla implements Car {
    private double speed;
    public Tesla(double speed) {this.speed = speed;}
    public double increaseSpeed() {
        Random random = new Random();
        return random.nextDouble() * 100 + 1;}
    public int decreaseSpeed() {
        return -45;
    }
    @Override
    public double getSpeed() {
        return speed;
    }
    /*private double width;
    public Square(double width) {
        this.width = width;
    }
    public double getArea() {
        return width * width;
    }
    public double getPerimeter() {
        return 4 * width;
    }*/
}