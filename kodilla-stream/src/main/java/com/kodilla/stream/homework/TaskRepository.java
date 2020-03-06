package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    LocalDate myDate1 = LocalDate.of(2020, 05, 31);
    LocalDate myDate2 = LocalDate.of(2020, 07, 31);
    LocalDate myDate3 = LocalDate.of(2020, 03, 15);
    LocalDate myDate4 = LocalDate.of(2020, 07, 31);
    LocalDate myDate5 = LocalDate.of(2020, 03, 30);
    LocalDate myDate6 = LocalDate.of(2020, 06, 30);
    LocalDate myDate7 = LocalDate.of(2020, 06, 05);

    public List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Przygotowanie trasy przejazdu", myDate1, myDate2));
        tasks.add(new Task("Zaplanowanie wycieczek podczas wakacji", myDate3, myDate1));
        tasks.add(new Task("Sprawdzenie i przygotowanie samochodu przed wyjazdem", myDate5, myDate6));
        tasks.add(new Task("Przygotowanie gier i zabaw", myDate7, myDate4));
        tasks.add(new Task("Przygotowanie sprzętu wodnego i plażowego", myDate7, myDate4));
        return tasks;
    }
}
