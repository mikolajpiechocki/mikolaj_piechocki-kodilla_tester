package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;


public class TaskManager {
    LocalDate currentDate = LocalDate.now();
    static TaskRepository taskRepository = new TaskRepository();
        public static void main(String[] args) {
            List<String> tasks = taskRepository.getTasks()
                .stream()
                .filter(u->u.getDeadline().isAfter(LocalDate.now()))
                .map(Task::getName)
                .collect(Collectors.toList());
        System.out.println(tasks);
    }
 }