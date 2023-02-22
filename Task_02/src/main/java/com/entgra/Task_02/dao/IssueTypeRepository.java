package com.entgra.Task_02.dao;

import com.entgra.Task_02.model.IssueType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface IssueTypeRepository extends JpaRepository<IssueType, Integer> {
}
