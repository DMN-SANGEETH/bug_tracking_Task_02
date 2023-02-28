package com.entgra.Task_02.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class IssueUpdateRequestDTO {
    private int issue_id;//Bug ID--> Issue
    private String status_name;//Issue State--> Status
    private String name;//Issue or issue type name--> IssueType
    private int fk_customer_id;//CustomerID-->customer
    private String title;//Bug titel--> issue
    private String summary;//Bug summary --> Issue
    private String report_date;// Report Date --> Issue

    public int getIssue_id() {
        return issue_id;
    }

    public void setIssue_id(int issue_id) {
        this.issue_id = issue_id;
    }

    public String getStatus_name() {
        return status_name;
    }

    public void setStatus_name(String status_name) {
        this.status_name = status_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFk_customer_id() {
        return fk_customer_id;
    }

    public void setFk_customer_id(int fk_customer_id) {
        this.fk_customer_id = fk_customer_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getReport_date() {
        return report_date;
    }

    public void setReport_date(String report_date) {
        this.report_date = report_date;
    }
}
