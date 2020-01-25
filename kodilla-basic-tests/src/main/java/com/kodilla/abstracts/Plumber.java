package com.kodilla.abstracts;

public class Plumber extends Job {
    public Plumber() {
        super(8000);
    }
    @Override
    public void giveResponsibilities() {
        System.out.println("Obowiżaki Hydraulika:");
            System.out.println("Budowa i naprawa sieci wod-kan, sieci gazowych gazowych i instalacji wentylacyjnych");
            System.out.println("Czytanie i zrozumienie rysunku technicznego");
            System.out.println("Posiadanie wiedzy, doświadczenia oraz zdolności manualnych i fizycznych do wykonywania zawodu hydraulika");
            System.out.println("Uprawnienia do wykonywania zawodu hydraulika");
    }
}
