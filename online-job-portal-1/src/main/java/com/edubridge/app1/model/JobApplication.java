package com.edubridge.app1.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="job_applications")
public class JobApplication {

	@Id
	@GeneratedValue
	private Long applicationId;
	
	@ManyToOne(cascade = CascadeType.ALL,
			fetch = FetchType.LAZY)
	@JoinColumn(name="employeeId")
	//@JoinColumn(name = "employeeLastName")
	private Employee employee;
	
	@ManyToOne(cascade = CascadeType.ALL,
			fetch = FetchType.LAZY)
	@JoinColumn(name="jobId")
	//@JoinColumn(name="companyName")
	private Job job;
	
	

	public JobApplication() {
		super();
	}



	public JobApplication(Long applicationId, Employee employee, Job job) {
		super();
		this.applicationId = applicationId;
		this.employee = employee;
		this.job = job;
	}



	public Long getApplicationId() {
		return applicationId;
	}



	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}



	public Employee getEmployee() {
		return employee;
	}



	public void setEmployee(Employee employee) {
		this.employee = employee;
	}



	public Job getJob() {
		return job;
	}



	public void setJob(Job job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "JobApplication [applicationId=" + applicationId + ", employee=" + employee + ", job=" + job + "]";
	}

	


}
