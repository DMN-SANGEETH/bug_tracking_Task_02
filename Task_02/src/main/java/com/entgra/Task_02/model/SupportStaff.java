package com.entgra.Task_02.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class SupportStaff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int staff_id;
    private String username;
    private String email;
    private String password;
    private int phone_number;

}
