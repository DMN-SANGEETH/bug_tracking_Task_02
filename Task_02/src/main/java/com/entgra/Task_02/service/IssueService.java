package com.entgra.Task_02.service;

import com.entgra.Task_02.dto.IssueDTO;
import com.entgra.Task_02.dto.request.IssueUpdateRequestDTO;
import com.entgra.Task_02.dto.response.IssueUpdateResponseDTO;

import java.util.List;

public interface IssueService {
    String addIssue(IssueDTO issueDTO);


    List<IssueDTO> getAllIssue();

    List<IssueUpdateResponseDTO> getBugList();

//    IssueUpdateRequestDTO addUser(IssueUpdateResponseDTO issueUpdateResponseDTO);
}
