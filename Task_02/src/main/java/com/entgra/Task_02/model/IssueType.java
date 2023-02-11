package com.entgra.Task_02.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class IssueType {
    @Id
    private Integer issue_type_id;
    private String issue_type_name;
    private String description;

//    @ManyToMany(mappedBy = "issueTypes")
//    private List<Project> projects;

}
