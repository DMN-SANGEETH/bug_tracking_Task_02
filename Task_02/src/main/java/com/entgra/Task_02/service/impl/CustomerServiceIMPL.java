package com.entgra.Task_02.service.impl;

import com.entgra.Task_02.dao.CustomerRepository;
import com.entgra.Task_02.dto.CustomerDTO;
import com.entgra.Task_02.model.Customer;
import com.entgra.Task_02.service.CustomerService;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Data
public class CustomerServiceIMPL implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public String addCustomer(CustomerDTO customerDTO) {
        Customer customer = modelMapper.map(customerDTO, Customer.class);
        customerRepository.save(customer);
        return "saved";
    }
}
