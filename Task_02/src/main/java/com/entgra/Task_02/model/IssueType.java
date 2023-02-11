package com.entgra.Task_02.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
@Data
@Entity
public class IssueType {
    @Id
    private Integer issue_type_id;
    private String issue_type_name;
    private String description;
    private Integer project_id;

}
