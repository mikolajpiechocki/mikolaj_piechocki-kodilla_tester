package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Square;

import java.util.ArrayList;
import java.util.List;

public class ShapesListApplication {
    public static void main(String[] args) {
        List<Square> shepes = new ArrayList<>();
//        Square sq1 = new Square(10);  //możliwy zapis
//        Square sq2 = new Square(5);
//        Square sq3 = new Square(1);
//        shepes.add(sq1);
//        shepes.add(sq2);
//        shepes.add(sq3);
          shepes.add(new Square(10));
          shepes.add(new Square(5));
          shepes.add(new Square(1));

          for (int n=0; n<shepes.size(); n++) {
              Square square = shepes.get(n);
              if (square.getArea() > 20)
                  System.out.println(square + " , area: " + square.getArea());
          }

          for (Square square: shepes) {
              if (square.getArea() > 20)
                  System.out.println(square + " , area: " + square.getArea());
          }
    }
}
