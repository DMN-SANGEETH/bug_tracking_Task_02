package com.entgra.Task_02.service.impl;

import com.entgra.Task_02.dao.CustomerRepository;
import com.entgra.Task_02.dto.CustomerDTO;
import com.entgra.Task_02.model.Customer;
import com.entgra.Task_02.service.CustomerService;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
        if (!customerRepository.existsById(customer.getCustomer_id())) {
            customerRepository.save(customer);
            return "Save successfuly";
        } else {
            throw new DuplicateKeyException("Allreday added");
        }
    }


    @Override
    public String deleteCustomer(int customerID) {
        if (customerRepository.existsById(customerID)) {
            customerRepository.deleteById(customerID);
            return "Succesfully deleted" + customerID;
        } else {
            throw new RuntimeException("No customer found");
        }
    }

    @Override
    public List<CustomerDTO> getAllData() {
        List<Customer> customerList = customerRepository.findAll();
        List<CustomerDTO> customerDTOList = customerList.stream()
                .map(customer -> {
                    CustomerDTO customerDTO = modelMapper.map(customer, CustomerDTO.class);
                    customerDTO.setCustomer_id(customer.getCustomer_id());
                    return customerDTO;
                })
                .collect(Collectors.toList());
//        Customer allCustomer = modelMapper.map(Customer, customerDTO.class);
        return customerDTOList;
    }

    @Override
    public String updateCustomer(CustomerDTO customerDTO) {
        if(customerRepository.existsById(customerDTO.getCustomer_id())){
            Customer customer = modelMapper.map(customerDTO,Customer.class);
            customerRepository.save(customer);
            return "Success ful";
        } else {
            throw new RuntimeException("No Id");
        }
    }

    @Override
    public List<CustomerDTO> getAllCustomerByStatus(String name) {
        List<Customer> getStatusCustomer = customerRepository.findAllByUsername(name);
        List<CustomerDTO> customerDTONameList = getStatusCustomer.stream()
                .map(customer -> {
                    CustomerDTO customerDTO = modelMapper.map(customer, CustomerDTO.class);
                    customerDTO.setCustomer_id(customer.getCustomer_id());
                    return customerDTO;
                })
                .collect(Collectors.toList());
//        Customer allCustomer = modelMapper.map(Customer, customerDTO.class);
        return customerDTONameList;

    }

    @Override
    public CustomerDTO getCustomer(int customerID) {
        if (customerRepository.existsById(customerID)) {
            Customer customer = customerRepository.getReferenceById(customerID);
            CustomerDTO customerDTO = new CustomerDTO(
                    customer.getCustomer_id(),
                    customer.getUsername(),
                    customer.getEmail(),
                    customer.getPassword()
            );

            return customerDTO;
        }else {
            throw new RuntimeException("No Customers");
        }
    }


}
