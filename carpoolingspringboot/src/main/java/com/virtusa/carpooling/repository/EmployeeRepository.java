package com.virtusa.carpooling.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.virtusa.carpooling.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> 
{
	
}
