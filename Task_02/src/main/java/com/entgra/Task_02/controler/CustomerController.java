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
@RequestMapping("api/v1/customers")
@CrossOrigin
public class CustomerController {
    @Autowired
    public CustomerService customerService;
    @PostMapping("/customer")
    public String addCustomer(@RequestBody CustomerDTO customerDTO){
        customerService.addCustomer(customerDTO);
        return "saved";
    }
    @GetMapping("/all-data")
    public ResponseEntity<StandardResponse> getAllData(){
        List<CustomerDTO> customerDTOList = customerService.getAllData();
        return new ResponseEntity<StandardResponse>(
                new StandardResponse(200,"Success fully recived",customerDTOList),
                HttpStatus.OK
        );

    }
    @PutMapping("/update-customer")
    public ResponseEntity<StandardResponse> updateCustomer(@RequestBody CustomerDTO customerDTO){
        String customerDTOup = customerService.updateCustomer(customerDTO);
        return new ResponseEntity<StandardResponse>(
                new StandardResponse(200,"Success fully recived",customerDTOup),
                HttpStatus.CREATED);
    }
    @GetMapping("/customer/{id}")
    public ResponseEntity<StandardResponse> getCustomer(@PathVariable(value = "id") int customerID){
        CustomerDTO customerDTO = customerService.getCustomer(customerID);
        return new ResponseEntity<StandardResponse>(
                new StandardResponse(200,"Success fully recived",customerDTO),
                HttpStatus.OK
                );
    }
    @DeleteMapping(path ="/deleteCustomer/{id}")
    public String deleteCustomer(@PathVariable(value = "id") int customerID){
        return customerService.deleteCustomer(customerID);
    }
    @GetMapping("/getAllCustomerBy/{Status}")
    public List<CustomerDTO> getAllCustomerBy(@PathVariable(value = "Status") String name){
        return customerService.getAllCustomerByStatus(name);
    }

}
