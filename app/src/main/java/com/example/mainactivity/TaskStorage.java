package com.example.mainactivity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskStorage {
    private static final TaskStorage taskStorage = new TaskStorage();
    private static final int DEFAULT_TASKS = 150;
    private final List<Task> tasks;

    public static TaskStorage getInstance()
    {
        return taskStorage;
    }

    private TaskStorage()
    {
        tasks= new ArrayList<Task>();
        for(int i = 1; i <= DEFAULT_TASKS; i++)
        {
            Task task = new Task();
            task.setName("Pilne zadanie nr. " + i);
            task.setDone(i % 3 == 0);
            if(i % 3 == 0)
            {
                task.setCategory(Category.STUDIES);
            }
            else
            {
                task.setCategory(Category.HOME);
            }
            tasks.add(task);
        }
    }

    public List<Task> getTasks()
    {
        return tasks;
    }
    public Task getTask(UUID id)
    {
        for (Task task : tasks) {
            if (task.getId().equals(id)) {
                return task;
            }
        }
        return null;
    }

    public void addTask(Task task)
    {
        tasks.add(task);
    }
}