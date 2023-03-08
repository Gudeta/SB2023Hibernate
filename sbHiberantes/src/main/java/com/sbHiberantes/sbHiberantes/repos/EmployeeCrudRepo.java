package com.sbHiberantes.sbHiberantes.repos;

import com.sbHiberantes.sbHiberantes.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
public interface EmployeeCrudRepo extends JpaRepository<Employee, Long> {
    //Method fetch
}
