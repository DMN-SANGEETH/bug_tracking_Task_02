package com.entgra.Task_02.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;
//import java.util.List;


@Data
@Entity

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customer_id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_user_id")
    private User users;

//    @OneToMany(mappedBy = "project_id", cascade = CascadeType.ALL)
//    private Set<Project> projects;




}
