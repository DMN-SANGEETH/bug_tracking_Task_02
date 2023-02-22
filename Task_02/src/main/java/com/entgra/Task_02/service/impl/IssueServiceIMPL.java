package com.entgra.Task_02.service.impl;

import com.entgra.Task_02.dao.*;
import com.entgra.Task_02.dto.CustomerDTO;
import com.entgra.Task_02.dto.IssueDTO;
import com.entgra.Task_02.model.Customer;
import com.entgra.Task_02.model.Issue;
import com.entgra.Task_02.model.IssueType;
import com.entgra.Task_02.service.IssueService;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class IssueServiceIMPL implements IssueService {
    @Autowired
    private IssueRepository issueRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private IssueTypeRepository issueTypeRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private SupportStaffRepository supportStaffRepository;
    @Autowired
    private StatusRepository statusRepository;
    @Override
    public String addIssue(IssueDTO issueDTO) {
        Issue issue = modelMapper.map(issueDTO,Issue.class);

        issue.setFk_issue_type_id(issueTypeRepository.findById(issueDTO.getFk_issue_type_id()).get());
        issue.setFk_customer_id(customerRepository.findById(issueDTO.getFk_customer_id()).get());
        issue.setFk_staff_id(supportStaffRepository.findById(issueDTO.getFk_staff_id()).get());
        issue.setFk_status_id(statusRepository.findById(issueDTO.getFk_status_id()).get());

        issueRepository.save(issue);
        return "Susess";
    }

    @Override
    public List<IssueDTO> getAllIssue() {
        List<Issue> issueList = issueRepository.findAll();
        if (issueList.size() >0){
            List<IssueDTO> issueDTOS = modelMapper.map(issueList, new TypeToken<List<IssueDTO>>(){}.getType());
            return issueDTOS;
        }else {
            throw new RuntimeException("Not working");
        }
    }

}
