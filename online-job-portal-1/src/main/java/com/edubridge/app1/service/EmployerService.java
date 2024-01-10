package com.edubridge.app1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.app1.dao.EmployerDao;
import com.edubridge.app1.model.Employer;

@Service
public class EmployerService {

	@Autowired
	private EmployerDao dao;
	
	public Employer saveEmployer(Employer emp) {
		return dao.saveEmployer(emp);
	}
	public List<Employer> getEmployers(){
		return dao.getEmployers();
	
		
	}
	public Employer getEmployerById(Integer employerId) {
		return dao.getEmployer(employerId);
		
	}
	
	public Employer getEmployerByEmail(String emailId) {
		return dao.getEmployer(emailId);
		
	}public void updateEmployer(Employer emp) {
		dao.updateEmployer(emp);
	}
	public void deleteEmployer(Integer employerId) {
		dao.deleteEmployer(employerId);
		
	}
	
}
