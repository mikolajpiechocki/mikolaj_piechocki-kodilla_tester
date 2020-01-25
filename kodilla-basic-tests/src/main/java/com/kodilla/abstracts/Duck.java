package com.kodilla.abstracts;

public class Duck extends Animal {
    public Duck() {
        super(4);
    }

    @Override
    public void giveVoice() {
        System.out.println("Quack");
    }
}
