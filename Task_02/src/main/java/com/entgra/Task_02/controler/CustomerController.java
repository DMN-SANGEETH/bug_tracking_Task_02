package com.entgra.Task_02.controler;

import com.entgra.Task_02.dto.CustomerDTO;

import com.entgra.Task_02.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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
    @GetMapping("/getAllData")
    public List<CustomerDTO> getAllData(){
        List<CustomerDTO> customerDTOList = customerService.getAllData();
        return customerDTOList;

    }
    @PutMapping("/updateCustomer")
    public CustomerDTO updateCustomer(@RequestBody CustomerDTO customerDTO){
        CustomerDTO customerDTOup = customerService.updateCustomer(customerDTO);
        return customerDTOup;
    }
//    @GetMapping("/getCustomer/{id}")
//    public String getCustomer(@PathVariable int customerID){
//        return customerService.getCustomer(customerID);
//    }
    @DeleteMapping(path ="/deleteCustomer/{id}")
    public String deleteCustomer(@PathVariable(value = "id") int customerID){
        String delete = customerService.deleteCustomer(customerID);
        return delete;
    }
    @GetMapping("/getAllCustomerBy/{Status}")
    public List<CustomerDTO> getAllCustomerBy(@PathVariable(value = "Status") String name){
        List<CustomerDTO> customerDTONameList = customerService.getAllCustomerByStatus(name);
        return  customerDTONameList;
    }

}
