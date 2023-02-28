package com.entgra.Task_02.model;

import lombok.Data;
import sun.util.calendar.BaseCalendar;

import javax.persistence.*;

@Data
@Entity
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int issue_id;
    private String summary;
    private String title;
    private String description;
    private String report_date;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_issue_type_id")
    private IssueType fk_issue_type_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_customer_id")
    private Customer fk_customer_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_staff_id")
    private SupportStaff fk_staff_id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_status_id")
    private Status fk_status_id;

    public int getIssue_id() {
        return issue_id;
    }

    public void setIssue_id(int issue_id) {
        this.issue_id = issue_id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReport_date() {
        return report_date;
    }

    public void setReport_date(String report_date) {
        this.report_date = report_date;
    }

    public IssueType getFk_issue_type_id() {
        return fk_issue_type_id;
    }

    public void setFk_issue_type_id(IssueType fk_issue_type_id) {
        this.fk_issue_type_id = fk_issue_type_id;
    }

    public Customer getFk_customer_id() {
        return fk_customer_id;
    }

    public void setFk_customer_id(Customer fk_customer_id) {
        this.fk_customer_id = fk_customer_id;
    }

    public SupportStaff getFk_staff_id() {
        return fk_staff_id;
    }

    public void setFk_staff_id(SupportStaff fk_staff_id) {
        this.fk_staff_id = fk_staff_id;
    }

    public Status getFk_status_id() {
        return fk_status_id;
    }

    public void setFk_status_id(Status fk_status_id) {
        this.fk_status_id = fk_status_id;
    }
}
