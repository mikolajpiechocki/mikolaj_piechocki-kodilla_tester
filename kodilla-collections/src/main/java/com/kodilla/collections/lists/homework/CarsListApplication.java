package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Tesla;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.interfaces.homework.Volvo;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new  Volvo(40));
        cars.add(new Toyota(70));
        Tesla tesla = new Tesla(120);
        cars.add(tesla);

        cars.remove(1);
        cars.remove(tesla);

        System.out.println(cars.size());
        for (Car car: cars){
            System.out.println(car.getSpeed() + " mph - speed of car and " + car.increaseSpeed() + " increase.");
        }
    }
}
