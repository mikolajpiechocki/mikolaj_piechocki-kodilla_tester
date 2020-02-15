package com.kodilla.collections.interfaces.homework;

public class Tesla implements Car {
    private int speed;
    public Tesla(int speed) {this.speed = speed;}
    public int increaseSpeed() {return 100;}
    public int decreaseSpeed() {
        return -45;
    }
    @Override
    public int getSpeed() {
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