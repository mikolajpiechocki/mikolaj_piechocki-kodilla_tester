package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Maluszek",2.2,1.1,true));
        stamps.add(new Stamp("Złoto1",2.1,2.11,false));
        stamps.add(new Stamp("Złoto2",2.1,2.11,false));
        stamps.add(new Stamp("Serek",1.34,2.54,true));
        stamps.add(new Stamp("Maluszek",2.2,1.1,true));
        stamps.add(new Stamp("Złoto1",2.1,2.11,false));
        stamps.add(new Stamp("Złoto2",2.1,2.11,false));
        stamps.add(new Stamp("Kolory",3.4,5.3,false));

        System.out.println(stamps.size());
        for (Stamp stamp: stamps)
            System.out.println(stamp);
    }
}
