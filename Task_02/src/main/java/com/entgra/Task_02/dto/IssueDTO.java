package com.entgra.Task_02.dto;

import lombok.Data;

@Data
public class IssueDTO {
    private int issue_id;
    private String summary;
    private String title;
    private String description;
    private String report_date;
}
