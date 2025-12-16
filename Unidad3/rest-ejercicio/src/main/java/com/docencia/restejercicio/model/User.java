package com.docencia.restejercicio.model;

import java.util.Objects;

public class User {

    private Long id;
    private String username;
    private String email;

    public User() {
    }

    public User(Long id) {
        this.id = id;
    }

    public User(Long id, String username, String email) {
        if (id==null) {
            id=(long) (Math.random()*10000L);
        }
        this.id = id;
        this.username = username;
        this.email = email;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        User other = (User) obj;
        return Objects.equals(id, other.id);
    }
}
