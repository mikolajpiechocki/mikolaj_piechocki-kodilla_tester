package com.kodilla.collections.interfaces.homework;

public class Tesla implements Car {
    private int speed;
    public Tesla(int speed) {
        this.speed = speed;
    }
    @Override
    public void increaseSpeed() {
        speed=+100;
    }
    @Override
    public void decreaseSpeed() {
        speed=-45;
    }
    @Override
    public int getSpeed() {
        return speed;
    }
}