package com.entgra.Task_02.controler;

import com.entgra.Task_02.dto.IssueDTO;
import com.entgra.Task_02.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/issue")

public class IssueController {
    @Autowired
    public IssueService issueService;
    @PostMapping("/addIssue")
    public String addIssue(@RequestBody IssueDTO issueDTO){
        String issue = issueService.addIssue(issueDTO);
        return issue;
    }
    @GetMapping("/getAll")
    public List<IssueDTO> getAllIssue(){
        List<IssueDTO> issueDTOSList = issueService.getAllIssue();
        return issueDTOSList;
    }

}
