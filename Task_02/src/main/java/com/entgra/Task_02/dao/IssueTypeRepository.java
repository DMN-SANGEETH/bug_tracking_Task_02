package com.entgra.Task_02.dao;

import com.entgra.Task_02.model.IssueType;
import org.springframework.data.repository.CrudRepository;

public interface IssueTypeRepository extends CrudRepository<IssueType, Integer> {
}
