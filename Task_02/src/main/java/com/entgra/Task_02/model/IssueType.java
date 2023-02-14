package com.entgra.Task_02.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class IssueType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer issue_type_id;
    private String name;
    private String description;
    @OneToMany(mappedBy = "issueType", cascade = CascadeType.ALL)
    private List<Issue> issues;

}
