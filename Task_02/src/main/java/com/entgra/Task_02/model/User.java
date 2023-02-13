package com.entgra.Task_02.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;
    private String username;
    private String email;
    private String password;
    private String phone_number;
    @OneToOne(mappedBy = "users")
    private Customer customers;
    @OneToOne(mappedBy = "users")
    private SupportStaff supportStaffs;
}
