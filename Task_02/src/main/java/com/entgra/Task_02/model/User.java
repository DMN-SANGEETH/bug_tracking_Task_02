package com.entgra.Task_02.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
@Data
@Entity
public class User {
    @Id
    private Integer user_id;
    private String username;
    private String email;
    private String password;
    private String phone_number;
}
