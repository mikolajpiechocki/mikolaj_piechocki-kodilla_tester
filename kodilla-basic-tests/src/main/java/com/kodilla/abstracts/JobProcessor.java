package com.kodilla.abstracts;

public class JobProcessor {

    public void process(Job job) {
        System.out.println("Wynagrodzenie pracownika to " + job.getSalary() + " Polskich złotych");
        job.giveResponsibilities();
    }



}
