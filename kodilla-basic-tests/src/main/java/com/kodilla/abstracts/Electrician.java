package com.kodilla.abstracts;

public class Electrician extends Job {
    public Electrician() {
        super(10000);
    }

    @Override
    public void giveResponsibilities() {
            System.out.println("EObowiązki elektryka to:");
            System.out.println("Budowa i wymiana instalacji elektrycznych");
            System.out.println("Czytanie i zrozumienie rysunku technicznego");
            System.out.println("Posiadanie wiedzy, doświadczenia oraz zdolności manualnych i fizycznych do wykonywania zawodu elektryka");
            System.out.println("Uprawnienia elektryczne minimum 1 kV");
        }

    }

