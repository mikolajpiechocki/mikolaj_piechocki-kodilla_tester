package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Double> classes = new ArrayList<>();

    public School(int ... classes) {
        for (double clas : classes)
            this.classes.add(clas);
    }

    public int getSum() {
        int sum = 0;
        for (double clas : classes)
            sum += clas;
        return sum;
    }

    public double getAverage(){
        double sum = 0;
        for (double clas : classes)
            sum += clas;
        return sum/classes.size();
    }

    @Override
    public String toString() {
        return "School{" +
                "classes: " + classes.toString() +
                '}';
    }
}
