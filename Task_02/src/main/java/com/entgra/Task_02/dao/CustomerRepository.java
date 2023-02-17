package com.entgra.Task_02.dao;

import com.entgra.Task_02.dto.CustomerDTO;
import com.entgra.Task_02.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findAllByUsername(String name);
}
