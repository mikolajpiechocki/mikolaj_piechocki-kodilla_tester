package com.kodilla.collections.interfaces.homework;

import org.w3c.dom.ls.LSOutput;

public class CarRace {
       public static void main(String[] args) {
        Volvo volvo = new Volvo(50);
        doRace(volvo);
        Toyota toyota = new Toyota(50);
        doRace(toyota);
        Tesla tesla = new Tesla(50);
        doRace(tesla);
    }
     private static void doRace(Car car){
        sum = car.getSpeed()+car.increaseSpeed()*3+car.decreaseSpeed()*2;
        System.out.println(car.getSpeed());
    }
}
