package com.edubridge.app1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.app1.model.Employee;
import com.edubridge.app1.service.EmployeeService;

@RestController
@RequestMapping
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@PostMapping("/employee")
	public ResponseEntity<Employee>save(@RequestBody Employee empl){
		Employee saveEmployee=service.saveEmployee(empl);
		return new ResponseEntity<>(saveEmployee,HttpStatus.OK);
		
	}
	@GetMapping("/employee")
	public ResponseEntity<List<Employee>> getallEmployees(){
		List<Employee> employees=service.getEmployees();
		return new ResponseEntity<>(employees,HttpStatus.OK);
	}
	
	  @GetMapping("/employee/{Id}") public ResponseEntity<Employee>
	  getOneEmployee(@PathVariable("Id") Integer employeeId){ Employee
	  employee=service.getEmployee(employeeId); return new
	  ResponseEntity<Employee>(employee,HttpStatus.OK);
	  
	  }
	 
	
	/*@GetMapping("/employee/{emailId}")
	public ResponseEntity<Employee>getOneEmployee(@PathVariable("emailId") String emailId){
		Employee employee=service.getEmployee(emailId);
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
		
	}*/
	@DeleteMapping("/employee/{id}")
	public ResponseEntity<Employee>deleteEmployee(@PathVariable("id") Integer employeeId){
		service.deleteEmployee(employeeId);
		return new ResponseEntity<Employee>(HttpStatus.OK);
		
	}
	
	
	@PutMapping("/employee")
	public ResponseEntity<Employee>updateEmployee(@RequestBody Employee employee){
		service.updateEmployee(employee);
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
	
}
