package com.entgra.Task_02.dao;

import com.entgra.Task_02.model.Issue;
import org.springframework.data.repository.CrudRepository;

public interface IssueRepository extends CrudRepository<Issue, Integer> {
}
