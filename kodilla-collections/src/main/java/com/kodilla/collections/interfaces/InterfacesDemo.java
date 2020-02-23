package com.kodilla.collections.interfaces;

public class InterfacesDemo {
    public static void main(String[] args) {
            Square square = new Square (10.0);
            showShapeDetails(square);
            Circle circle = new Circle(7.0);
            showShapeDetails(circle);
            Tringle tringle = new Tringle(4.0, 3.0, 5.0 );
            showShapeDetails(tringle);
            }
    private static void showShapeDetails(Shape shape){
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
    }
 /*   private static void showCircleDetails (Circle circle){
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }
    private  static void showTringleDetails (Tringle tringle){
        System.out.println(tringle.getArea());
        System.out.println(tringle.getPerimeter());
    }*/
}
