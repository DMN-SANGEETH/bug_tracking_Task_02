package com.entgra.Task_02.controler;

import com.entgra.Task_02.dto.CustomerDTO;

import com.entgra.Task_02.service.CustomerService;
import com.entgra.Task_02.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
//    @GetMapping("/getAllData")
//    public List<CustomerDTO> getAllData(){
//        List<CustomerDTO> customerDTOList = customerService.getAllData();
//        return customerDTOList;
//
//    }
    @GetMapping("/getAllData")
    public ResponseEntity<StandardResponse> getAllData(){
        List<CustomerDTO> customerDTOList = customerService.getAllData();
        return new ResponseEntity<StandardResponse>(
                new StandardResponse(200,"Success fully recived",customerDTOList),
                HttpStatus.OK
        );

    }
    @PutMapping("/updateCustomer")
    public ResponseEntity<StandardResponse> updateCustomer(@RequestBody CustomerDTO customerDTO){
        String customerDTOup = customerService.updateCustomer(customerDTO);
        return new ResponseEntity<StandardResponse>(
                new StandardResponse(200,"Success fully recived",customerDTOup),
                HttpStatus.CREATED);
    }
    @GetMapping("/getCustomer/{id}")
    public ResponseEntity<StandardResponse> getCustomer(@PathVariable(value = "id") int customerID){
        CustomerDTO customerDTO = customerService.getCustomer(customerID);
        return new ResponseEntity<StandardResponse>(
                new StandardResponse(200,"Success fully recived",customerDTO),
                HttpStatus.OK
                );
    }
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
