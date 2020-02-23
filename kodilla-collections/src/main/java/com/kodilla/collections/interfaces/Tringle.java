package com.kodilla.collections.interfaces;

import java.util.Objects;

public class Tringle implements Shape{
    private double width;
    private double height;
    private double hypotenuse;
    public Tringle(double width, double height, double hypotenuse) {
        this.width = width;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }
    @Override
    public double getArea() {
        return width * height / 2;
    }
    @Override
    public double getPerimeter() {
        return width + height + hypotenuse;
    }

    @Override
    public String toString() {
        return "Tringle{" +
                "width=" + width +
                ", height=" + height +
                ", hypotenuse=" + hypotenuse +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tringle tringle = (Tringle) o;
        return Double.compare(tringle.width, width) == 0 &&
                Double.compare(tringle.height, height) == 0 &&
                Double.compare(tringle.hypotenuse, hypotenuse) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height, hypotenuse);
    }
}
