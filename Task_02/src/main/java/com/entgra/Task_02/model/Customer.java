package com.entgra.Task_02.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
@Data
@Entity
public class Customer {
    @Id
    private String customer_id;
    private Integer user_id;

}
