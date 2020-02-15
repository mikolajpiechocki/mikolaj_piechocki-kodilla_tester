package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car {
        private int speed;
        public Toyota (int speed){
            this.speed = speed;
        }
        @Override
        public int increaseSpeed() {
            return +70;
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
