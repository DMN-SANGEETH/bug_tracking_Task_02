package com.entgra.Task_02.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

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
    private IssueType issueType;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_customer_id")
    private Customer customers;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_staff_id")
    private SupportStaff supportStaffs;
    @OneToMany(mappedBy = "issues", cascade = CascadeType.ALL)
    private List<Status> statuses;

}
