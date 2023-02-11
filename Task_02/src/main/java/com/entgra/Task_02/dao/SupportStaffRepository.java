package com.entgra.Task_02.dao;

import com.entgra.Task_02.model.SupportStaff;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupportStaffRepository extends CrudRepository<SupportStaff, Integer> {
}
