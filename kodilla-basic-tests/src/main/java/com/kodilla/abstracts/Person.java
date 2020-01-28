package com.kodilla.abstracts;

public class Person {
    // private int wheels;
    //    private int seats;
    private Person firstName;

    public Person getFirstName() {
        return firstName;
    }
    private int age;

    public int Person (int age,int job) {
        return age;
    }
    private int job;
    public Person(int job) {
        this.job = job;
    }

     public static void main(String[] args) {
         Dog dog = new Dog();
        dog.giveVoice();
        Duck duck = new Duck();
        duck.giveVoice();
        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog);
        processor.process(duck);

        Job plumber = new Plumber();
        plumber.giveResponsibilities();
        Job electrician = new Electrician();
        electrician.giveResponsibilities();
        Job itSpecialist = new ItSpecialist();
        itSpecialist.giveResponsibilities();
        Job tester = new Tester();
        tester.giveResponsibilities();
        JobProcessor processor1 = new JobProcessor();
            processor1.process(plumber);
            processor1.process(electrician);
            processor1.process(itSpecialist);
            processor1.process(tester);

    }
}
