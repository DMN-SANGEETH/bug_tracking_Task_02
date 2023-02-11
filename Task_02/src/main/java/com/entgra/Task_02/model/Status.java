package com.entgra.Task_02.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
@Data
@Entity
public class Status {
    @Id
    private Integer status_id;
    private String status_name;
    private Integer issue_id;
}

