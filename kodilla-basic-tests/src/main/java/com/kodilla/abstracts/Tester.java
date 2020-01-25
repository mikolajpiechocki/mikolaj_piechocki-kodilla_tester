package com.kodilla.abstracts;

public class Tester extends Job{
    public Tester() {
        super(11000);
    }
    @Override
    public void giveResponsibilities() {
        System.out.println("Obowiżaki Testera:");
        System.out.println("Podstawowe umiejętności programowania w językach Java i C++");
        System.out.println("Czytanie i zrozumienie dokumentacji testowej oraz opracowanie i przygotowanie testów");
        System.out.println("Posiadanie wiedzy, doświadczenia oraz zdolności umysłowych do wykonywania zawodu testera");
        System.out.println("Ukończenie kursu STQB");
    }
}
