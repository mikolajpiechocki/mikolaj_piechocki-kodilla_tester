package com.kodilla.abstracts;

public class ItSpecialist extends Job {
    public ItSpecialist() {
        super(12000);
    }
    @Override
    public void giveResponsibilities() {
        System.out.println("Obowiżaki Informatyka:");
        System.out.println("Umiejątność programowania w językach Java, Phyton i C++");
        System.out.println("Czytanie i zrozumienie dokumentacji przygotowawczej");
        System.out.println("Posiadanie wiedzy, doświadczenia oraz zdolności umosłowych do wykonywania zawodu informatyka");
            }
}
