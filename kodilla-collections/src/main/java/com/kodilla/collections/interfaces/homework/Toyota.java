package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car {
        private int speed;
        public Toyota (int speed){
            this.speed = speed;
        }
        @Override
        public void increaseSpeed() {
            speed=+70;
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
