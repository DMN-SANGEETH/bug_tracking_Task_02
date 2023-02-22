package com.entgra.Task_02.dao;

import com.entgra.Task_02.model.Issue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface IssueRepository extends JpaRepository<Issue, Integer> {
}
