package com.entgra.Task_02.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class IssueDTO {
    private int issue_id;
    private int fk_issue_type_id;
    private int fk_customer_id;
    private int fk_staff_id;
    private String summary;
    private String title;
    private String description;
    private String report_date;
    private int fk_status_id;
}
