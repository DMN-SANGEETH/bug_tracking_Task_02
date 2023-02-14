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


}
