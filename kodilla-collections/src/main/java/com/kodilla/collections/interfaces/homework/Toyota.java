package com.kodilla.collections.interfaces.homework;

import java.util.Random;

public class Toyota implements Car {
        private double speed;
        public Toyota (double speed){
            this.speed = speed;
        }
        @Override
        public double increaseSpeed() { Random random = new Random();
            return random.nextDouble() * 100 + 1;
        }
        @Override
        public int decreaseSpeed() {
            return -45;
        }
        @Override
        public double getSpeed() {
            return speed;
        }
}
