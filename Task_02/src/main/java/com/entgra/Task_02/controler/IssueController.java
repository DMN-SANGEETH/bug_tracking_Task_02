package com.entgra.Task_02.controler;

import com.entgra.Task_02.dto.IssueDTO;
import com.entgra.Task_02.dto.response.IssueUpdateResponseDTO;
import com.entgra.Task_02.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("api/v1/issues")

public class IssueController {
    @Autowired
    public IssueService issueService;
    @PostMapping("/issue-form")
    public String addIssue(@RequestBody IssueDTO issueDTO){
        return issueService.addIssue(issueDTO);
    }

//    @PostMapping()
//    public IssueUpdateResponseDTO addUser(@RequestBody IssueUpdateResponseDTO issueUpdateResponseDTO ){
//        IssueUpdateResponseDTO studentRequestDtos = issueService.addUser(issueUpdateResponseDTO);
//        return studentRequestDtos;
//    }

    @GetMapping("/all")
    public List<IssueDTO> getAllIssue(){
        return issueService.getAllIssue();
    }

    @GetMapping("/bugList")
    public List<IssueUpdateResponseDTO> getBugList(){
        return issueService.getBugList();
    }

}
