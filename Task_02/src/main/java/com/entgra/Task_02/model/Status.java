package com.entgra.Task_02.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer status_id;
    private String status_name;

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_issue_id", referencedColumnName = "issue_id")
//    private List<Issue> issues;
}

