package com.edubridge.app1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.edubridge.app1.model.JobApplication;
import com.edubridge.app1.service.JobApplicationService;
@Repository
public class JobApplicationController {

	@Autowired
	private JobApplicationService service;
	@PostMapping("/jobApplication")
	public ResponseEntity<JobApplication>save(@RequestBody JobApplication ja){
		JobApplication saveJobApplication=service.saveJobApplication(ja);
		return new ResponseEntity<>(saveJobApplication,HttpStatus.OK);
		
	}
	@GetMapping("/jobApplication")
	public ResponseEntity<List<JobApplication>> getAllJobApplications(){
		List<JobApplication> jobApplications=service.getJobApplications();
		return new ResponseEntity<>(jobApplications,HttpStatus.OK );
		
	}
	@GetMapping("/jobApplication/{Id}")
	public ResponseEntity<JobApplication> getOneJobApplicationBy (@PathVariable("Id") Long jobApplicationId){
		JobApplication jobApplication=service.getJobApplication(jobApplicationId);
		return new ResponseEntity<JobApplication>(jobApplication,HttpStatus.OK);
		
	}
	@DeleteMapping("/jobApplication/{id}")
	public ResponseEntity<JobApplication> deleteJobApplication(@PathVariable ("Id") Long jobApplicationId){
		service.deleteJobApplication(jobApplicationId);
		return new ResponseEntity<JobApplication>(HttpStatus.OK);
		
	}
	@PutMapping("/jobApplication")
public ResponseEntity<JobApplication> updateJobApplication(@RequestBody JobApplication jobApplication){
service.updateJobApplication(jobApplication);
	return new ResponseEntity<>(HttpStatus.OK);
	
}

}
