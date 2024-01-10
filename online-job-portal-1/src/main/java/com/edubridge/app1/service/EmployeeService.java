package com.edubridge.app1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.app1.dao.EmployeeDao;
import com.edubridge.app1.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao dao;
	
	public Employee saveEmployee(Employee empl) {
		return dao.saveEmployee(empl);
	}
	public List<Employee> getEmployees(){
		return dao.getEmployees();
	}
	public Employee getEmployee(Integer employeeId) {
		return dao.getEmployee(employeeId);
	}
	
	public Employee getEmployee(String emailId) {
		return dao.getEmployee(emailId);
	}
	public void updateEmployee(Employee empl) {
		dao.updateEmployee(empl);
	}
	public void deleteEmployee (Integer employeeId) {
		dao.deleteEmployee(employeeId);
	}
	
}
