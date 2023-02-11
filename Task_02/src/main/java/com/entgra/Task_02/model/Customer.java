package com.entgra.Task_02.model;

import lombok.Data;

import javax.persistence.*;
//import java.util.List;


@Data
@Entity
public class Customer {
    @Id
    private Integer customer_id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_user_id")
    private User users;




}
