package com.kodilla.abstracts;

public class Application {
    public static void main(String[] args) {
        Dog dog = new Dog();  // możemy również użyć Animal dog = new Dog();  tzw polimorfizm
            dog.giveVoice();
        Duck duck = new Duck();
        duck.giveVoice();

        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog);
        processor.process(duck);

        Shape square = new Square();
            square.giveSurfaceArea();
            square.giveCircuit();

        Shape rectangle = new Rectangle();
            rectangle.giveSurfaceArea();
            rectangle.giveCircuit();

        Shape circle = new Circle();
            circle.giveSurfaceArea();
            circle.giveCircuit();
    }
}
