package com.entgra.Task_02.dto;

import com.entgra.Task_02.dto.request.IssueUpdateRequestDTO;
import com.entgra.Task_02.dto.response.IssueUpdateResponseDTO;
import com.entgra.Task_02.model.Issue;

import java.util.ArrayList;
import java.util.List;

public class mapper {
    public static List<IssueUpdateResponseDTO> issueToIssueDtos(List<Issue> issues) {
        List<IssueUpdateResponseDTO> issueUpdateResponseDtos = new ArrayList<>();
        for (Issue issued: issues) {
            issueUpdateResponseDtos.add(issueToIssueDto(issued));
        }
        return issueUpdateResponseDtos;
    }

    private static IssueUpdateResponseDTO issueToIssueDto(Issue issue) {
        IssueUpdateResponseDTO issueUpdateResponseDto = new IssueUpdateResponseDTO();
        issueUpdateResponseDto.setIssue_id(issue.getIssue_id());
        issueUpdateResponseDto.setStatus_name(issue.getFk_status_id().getStatus_name());
        issueUpdateResponseDto.setName(issue.getFk_issue_type_id().getName());
        issueUpdateResponseDto.setFk_customer_id(issue.getFk_customer_id().getCustomer_id());
        issueUpdateResponseDto.setTitle(issue.getTitle());
        issueUpdateResponseDto.setSummary(issue.getSummary());
        issueUpdateResponseDto.setReport_date(issue.getReport_date());
        return issueUpdateResponseDto;
    }
}
