package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Task {
    private String name1;
    private LocalDate opened;
    private LocalDate deadline;

    public Task(String name1, LocalDate opened, LocalDate deadline) {
        this.name1 = name1;
        this.opened = opened;
        this.deadline = deadline;
    }

    public String getName() {
        return name1;
    }

    public LocalDate getOpened() {
        return opened;
    }

    public LocalDate getDeadline() {
        return deadline;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(name1, task.name1) &&
                opened==task.opened &&
//                Objects.equals(opened, task.opened) &&
                deadline == task.deadline;
//                Objects.equals(deadline, task.deadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name1, opened, deadline);
    }
}
