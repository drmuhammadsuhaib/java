package com.example.employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.employee.Model.Employee;

//First Parameter is Employee Model Class Name, Second Parameter Return Type of Primary key
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
