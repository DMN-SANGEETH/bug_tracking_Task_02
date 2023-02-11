package com.entgra.Task_02.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
public class User {
    @Id
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
