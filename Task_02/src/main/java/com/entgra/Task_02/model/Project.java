package com.entgra.Task_02.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Project {

    @Id
    private Integer project_id;
    private String project_name;
    private String description;
    private String lead_name;


}
