package com.entgra.Task_02.service;

import com.entgra.Task_02.dto.IssueDTO;

import java.util.List;

public interface IssueService {
    String addIssue(IssueDTO issueDTO);


    List<IssueDTO> getAllIssue();
}
