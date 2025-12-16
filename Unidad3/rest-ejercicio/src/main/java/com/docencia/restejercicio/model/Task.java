package com.docencia.restejercicio.model;

import java.util.Objects;

public class Task {

    private Long id;
    private String title;
    private String description;
    private boolean done;

    public Task() {
    }

    public Task(Long id) {
        this.id = id;
    }
    
    public Task(Long id, String title, String description, boolean done) {
        if (id==null) {
            id=(long) (Math.random()*10000L);
        }
        this.id = id;
        this.title = title;
        this.description = description;
        this.done = done;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Task other = (Task) obj;
        return Objects.equals(id, other.id);
    }

    
}
