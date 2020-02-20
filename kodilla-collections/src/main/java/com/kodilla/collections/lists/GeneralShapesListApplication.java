package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Tringle;

import java.util.LinkedList;
import java.util.List;

public class GeneralShapesListApplication {
    public static void main(String[] args) {
        List<Shape> shapes = new LinkedList<>();
            Square square = new Square(10);
            shapes.add(square);
            shapes.add(new Circle(7));
            shapes.add(new Tringle(10,4,10.77));

            shapes.remove(1);
            shapes.remove(square);
            Tringle tringle = new Tringle(10,4,10.77);
            shapes.remove(tringle);

            System.out.println(shapes.size());
            for (Shape shape: shapes){
                System.out.println(shape + ", area: " + shape.getArea() + ", permiter: " + shape.getPerimeter());
            }
    }
}
