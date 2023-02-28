package com.entgra.Task_02.controler;

//import com.entgra.Task_02.dto.request.StatusRequestDto;
import com.entgra.Task_02.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/status")
@CrossOrigin
public class StatusController {
    @Autowired
    private StatusService statusService;
//    @PutMapping("/updateStat")
//    public StatusRequestDto updateStatus(StatusRequestDto statusRequestDTO){
//        StatusRequestDto message = statusService.updateStatus(statusRequestDTO);
//        return message;
//    }
}
