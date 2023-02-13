package com.entgra.Task_02.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer project_id;
    private String project_name;
    private String description;
    private String lead_name;
//    @ManyToMany
//    @JoinTable(
//            name = "project_issue_type",
//            joinColumns = @JoinColumn(name = "project_id"),
//            inverseJoinColumns = @JoinColumn(name = "issue_type_id"))
//    private List<IssueType> issueTypes;

//    @ManyToMany
//    @JoinColumn(name = "fk_cus_id")
//    private Set<Customer> customers;
}
