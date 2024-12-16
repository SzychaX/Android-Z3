package com.example.mainactivity;


import java.util.Date;
import java.util.UUID;

public class Task {
    private UUID id;
    private String name;
    private Date date;
    private Boolean done;
    private Category category;

    public Task(){
        id = UUID.randomUUID();
        date = new Date();
    }

    public Task(String name, Boolean done, Category category)
    {
        id = UUID.randomUUID();
        date = new Date();
        this.name = name;
        this.done = done;
        this.category = category;
    }

    public UUID getId() {
        return id;
    }

    public void setName(String s)
    {
        name = s;
    }

    public String getName() {
        return name;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean isDone()
    {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public Category getCategory()
    {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
