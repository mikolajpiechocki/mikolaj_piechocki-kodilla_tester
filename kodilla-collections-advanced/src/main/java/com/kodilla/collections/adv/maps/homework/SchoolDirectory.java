package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> clas = new HashMap<>();
        Principal pawel = new Principal("Paweł", "Komasa");
        Principal zbigniew = new Principal("Zbigniew", "Bryński");
        Principal krzysztof = new Principal("Krzysztof", "Jerzyna");
        Principal jacek = new Principal("Jacek", "Placek");
        Principal jozef = new Principal("Józef", "Balcerek");

        School pawelSchool = new School(31, 35, 28, 34, 35, 26, 24, 21, 19, 31);
        School zbigniewSchool = new School(30, 28, 24, 27, 32, 26, 21, 22, 24, 29);
        School krzysztofSchool = new School(25, 26, 27, 21, 23, 24, 28, 29, 28, 21, 22);
        School jacekSchool = new School(38, 37, 39, 38, 39, 36, 37, 34, 35, 37);
        School jozefSchool = new School(32, 31, 25, 26, 24, 28, 29, 31, 34);

        clas.put(pawel,pawelSchool);
        clas.put(krzysztof, krzysztofSchool);
        clas.put(zbigniew, zbigniewSchool);
        clas.put(jacek, jacekSchool);
        clas.put(jozef, jozefSchool);

        for (Map.Entry<Principal, School> classesEntry : clas.entrySet())
            System.out.println(classesEntry.getKey().getFirstname() +" "+ classesEntry.getKey().getLastname() + ", średnia uczniów w klasach: " + classesEntry.getValue().getAverage() + ", suma uczniów w szkole: " + classesEntry.getValue().getSum());
    }

}
