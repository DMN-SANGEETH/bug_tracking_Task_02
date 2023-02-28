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
    @OneToMany(mappedBy = "fk_issue_type_id")
    private List<Issue> issues;

    public Integer getIssue_type_id() {
        return issue_type_id;
    }

    public void setIssue_type_id(Integer issue_type_id) {
        this.issue_type_id = issue_type_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Issue> getIssues() {
        return issues;
    }

    public void setIssues(List<Issue> issues) {
        this.issues = issues;
    }
}
