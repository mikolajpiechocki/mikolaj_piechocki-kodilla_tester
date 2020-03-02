package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import com.kodilla.stream.homework.TaskRepository;


public class TaskManager {
    LocalDate currentDate = LocalDate.now();

        public static void main(String[] args) {
       List<Task> tasks = TaskRepository.getTasks()
                .stream()
                .filter(u->u.getDeadline().equals(LocalDate.now()))
                .map(TaskManager::getName)
               .collect(Collectors.toList());
        System.out.println(tasks);
    }

       public static String getName(Task task){
        return Task.getName();
        }
    }
