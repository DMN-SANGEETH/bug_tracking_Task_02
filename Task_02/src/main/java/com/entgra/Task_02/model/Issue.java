package com.entgra.Task_02.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
@Data
@Entity
public class Issue {
    @Id
    private Integer issue_id;
    private String title;
    private String description;
    private Integer customer_id;
    private Integer staff_id;
    private Integer project_type_id;
    private Integer issue_type_id;
}
