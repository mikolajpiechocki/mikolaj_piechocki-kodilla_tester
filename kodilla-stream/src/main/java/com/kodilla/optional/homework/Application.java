package com.kodilla.optional.homework;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Adam Kowalski", "Piechniczek"));
        students.add(new Student("Zdzisław Pilski", "Listkiewicz"));
        students.add(new Student("Artur Żmijewski", null));
        students.add(new Student("Jacek Nowak", "Krotoszewicz"));
        students.add(new Student("Szymon Kurasiński", null));

        for (Student student : students) {
            if (student.getTeacher() != null)
                System.out.println("Uczeń: " + student.getName() + " - Trener: " + student.getTeacher());
        }

        Optional studentList = Optional.ofNullable(students);
        for (Student student : students) {
            if (student.getTeacher() == null)
                studentList.ifPresent(u -> {
                    System.out.println("Uczeń: " + student.getName() + " - Trener: <undefiuned> ");
                });
        }
    }
}

