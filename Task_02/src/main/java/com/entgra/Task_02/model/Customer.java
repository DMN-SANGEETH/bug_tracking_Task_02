package com.entgra.Task_02.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Data
@Entity

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customer_id;
    private String username;
    private String email;
    private String password;

    public Customer() {

    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Customer(int customer_id, String username, String email, String password) {
        this.customer_id = customer_id;
        this.username = username;
        this.email = email;
        this.password = password;
    }
}



