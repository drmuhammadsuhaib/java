package com.example.employee.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.Repository.EmployeeRepository;
import com.example.employee.Model.Employee;
@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;

	@PostMapping("/employees")
	public ResponseEntity<String> createNewEmployee(@RequestBody Employee employee) {
		Employee savedEmployee = employeeRepository.save(employee);
		if (savedEmployee != null) {
			return ResponseEntity.status(HttpStatus.CREATED).body("Employee Created Successfully in DB");
		} else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to create Employee");
		}
	}
}
