package com.entgra.Task_02.service.impl;

import com.entgra.Task_02.dao.*;
import com.entgra.Task_02.dto.IssueDTO;
import com.entgra.Task_02.dto.mapper;
import com.entgra.Task_02.dto.request.IssueUpdateRequestDTO;
import com.entgra.Task_02.dto.response.IssueUpdateResponseDTO;
import com.entgra.Task_02.model.Customer;
import com.entgra.Task_02.model.Issue;
import com.entgra.Task_02.model.IssueType;
import com.entgra.Task_02.model.Status;
import com.entgra.Task_02.service.IssueService;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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

    @Override
    public List<IssueUpdateResponseDTO> getBugList() {
        List<Issue> issues = StreamSupport
                .stream(issueRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
        return mapper.issueToIssueDtos(issues);
    }

//    @Override
//    public IssueUpdateRequestDTO addUser(IssueUpdateResponseDTO issueUpdateResponseDTO) {
//        Issue issue = new Issue();
//        issue.setIssue_id(issueUpdateResponseDTO.getIssue_id());
//        issue.setTitle(issueUpdateResponseDTO.getTitle());
//        issue.setSummary(issueUpdateResponseDTO.getSummary());
//        issue.setReport_date(issueUpdateResponseDTO.getReport_date());
//
//        Status status = new Status();
//        status.setStatus_name(status.getStatus_name());
//        statusRepository.save(status);
//
//        IssueType issueType = new IssueType();
//        issueType.setName(issueType.getName());
//        issueRepository.save(issue);
//
//        Customer customer = new Customer();
//        customer.setCustomer_id(customer.getCustomer_id());
//        customerRepository.save(customer);
//
//
//        IssueUpdateRequestDTO issueUpReq = new IssueUpdateRequestDTO();
//        issueUpReq.setIssue_id(i);
//        issueUpReq.setStatus_name(issue.getFk_status_id().getStatus_name());
//        issueUpReq.setName(issue.getFk_issue_type_id().getName());
//        issueUpReq.setFk_customer_id(issue.getFk_customer_id().getCustomer_id());
//        issueUpReq.setTitle(issue.getTitle());
//        issueUpReq.setSummary(issue.getSummary());
//        issueUpReq.setReport_date(issue.getReport_date());
//        return issueUpReq;



    }


