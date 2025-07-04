package com.neuravase.website.model;

import jakarta.annotation.Generated;
import jakarta.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String role = "USER";

    public Long getId() { return id; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) {
        this.password = password; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}