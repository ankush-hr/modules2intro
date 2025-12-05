package com.codingankush.modules2intro.repositories;

import com.codingankush.modules2intro.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepositories extends JpaRepository<EmployeeEntity, Long> {


}

