package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.summation(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda dodawania działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda dodawania nie działa poprawnie dla liczb " + a + " i " + b);
        }
        int subtractResult = calculator.subtract(a, b);
        boolean correct1 = ResultChecker.assertEquals(-3, subtractResult);
        if (correct1) {
            System.out.println("Metoda odejmowania działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda odejmowania nie działa poprawnie dla liczb " + a + " i " + b);
        }
        int n = 3;
        int expResult = calculator.exp(a, n);
        boolean correct2 = ResultChecker.assertEquals(125, expResult);
        if (correct2) {
            System.out.println("Metoda exp działa poprawnie dla liczb " + a + " i " + n);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + n);
        }
    }
}
