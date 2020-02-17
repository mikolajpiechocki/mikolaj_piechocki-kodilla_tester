package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Tesla;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.interfaces.homework.Volvo;

public class CarUtils {

    public static void describeCar(Car car){
        System.out.println("--------------------------------");
        System.out.println("Car kind: " + getCarName(car));
        System.out.println("Increase speed: " + car.increaseSpeed());
        }
    private static String getCarName(Car car){
        if (car instanceof Volvo)
            return "Volvo";
        else if (car instanceof Toyota)
            return  "Toyota";
        else if (car instanceof Tesla)
            return "Tesla";
        else
            return "Unknown car name";
    }
}
