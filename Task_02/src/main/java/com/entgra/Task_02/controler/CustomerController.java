package com.entgra.Task_02.controler;

import com.entgra.Task_02.dto.CustomerDTO;

import com.entgra.Task_02.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin
public class CustomerController {
    @Autowired
    public CustomerService customerService;
    @PostMapping("/addCustomer")
    public String addCustomer(@RequestBody CustomerDTO customerDTO){
        customerService.addCustomer(customerDTO);
        return "saved";
    }
}
