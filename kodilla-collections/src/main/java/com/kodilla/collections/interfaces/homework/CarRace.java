package com.kodilla.collections.interfaces.homework;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class CarRace {
    public static void main(String[] args) {
        Volvo volvo = new Volvo(50);
        doRace(volvo);
        Toyota toyota = new Toyota(50);
        doRace(toyota);
        Tesla tesla = new Tesla(50);
        doRace(tesla);
/*        System.out.println(doRace(volvo));
        System.out.println(doRace(toyota));
        System.out.println(doRace(tesla));*/
        List<Car> carList= new ArrayList<>();
        carList.add(volvo);
        carList.add(toyota);
        carList.add(tesla);
             for (Car car: carList){
            System.out.println(doRace(car));
 }
    }

    private static double doRace(Car car) {
        return car.getSpeed() + car.increaseSpeed() * 3 + car.decreaseSpeed() * 2;
    }

}
