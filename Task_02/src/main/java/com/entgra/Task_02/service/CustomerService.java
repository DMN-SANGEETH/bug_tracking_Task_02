package com.entgra.Task_02.service;

import com.entgra.Task_02.dto.CustomerDTO;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

public interface CustomerService {
    public String addCustomer(CustomerDTO customerDTO);

    public String deleteCustomer(int customerID);

    List<CustomerDTO> getAllData();

    CustomerDTO updateCustomer(CustomerDTO customerDTO);


    List<CustomerDTO> getAllCustomerByStatus(String statName);
}
