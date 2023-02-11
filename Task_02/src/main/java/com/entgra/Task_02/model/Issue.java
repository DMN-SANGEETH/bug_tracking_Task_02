package com.entgra.Task_02.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Issue {
    @Id
    private Integer issue_id;
    private String title;
    private String description;
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_customer_id", referencedColumnName = "customer_id")
//    private List<Customer> customers;
//
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_staff_id", referencedColumnName = "staff_id")
//    private List<SupportStaff> supportStaffs;
//
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_project_type_id", referencedColumnName = "project_type_id")
//    private List<Project> projects;
//
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_issue_type_id", referencedColumnName = "issue_type_id")
//    private List<Issue> issues;
}
