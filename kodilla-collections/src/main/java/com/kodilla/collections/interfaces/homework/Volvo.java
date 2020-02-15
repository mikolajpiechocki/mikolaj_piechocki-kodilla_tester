package com.kodilla.collections.interfaces.homework;

public class Volvo implements Car {
    private int speed;
    public Volvo (int speed){
        this.speed = speed;
    }
    @Override
        public int increaseSpeed() {
        return 50;
    }
    @Override
    public int decreaseSpeed() {
        return -45;
    }
    @Override
    public int getSpeed() {
        return speed;
    }
}
