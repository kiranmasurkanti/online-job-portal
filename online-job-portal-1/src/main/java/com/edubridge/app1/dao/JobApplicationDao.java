package com.edubridge.app1.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edubridge.app1.Repo.JobApplicationRepository;
import com.edubridge.app1.model.JobApplication;

@Repository
public class JobApplicationDao {
	@Autowired
	private JobApplicationRepository repo;

	public JobApplication saveJobApplication(JobApplication ja) {
		return repo.save(ja);
		
	}
	public List<JobApplication> getJobApplications(){
		return repo.findAll();
		
	}
	public JobApplication getJobApplication(Long applicationId) {
		return repo.findById(applicationId).get();
	}
	public void updateJobApplication(JobApplication ja) {
		repo.save(ja);
	}
	public void deleteJobApplication(Long JobApplicationId) {
		repo.deleteById(JobApplicationId);
	}
}
