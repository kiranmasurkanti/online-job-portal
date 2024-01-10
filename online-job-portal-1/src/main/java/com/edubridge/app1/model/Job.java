package com.edubridge.app1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="job_details")
public class Job {
	@Id
	@GeneratedValue
	public Integer jobId;
	public String title;
	public String companyName;
	public String jobDescription;
	public String skilsRequired;
	public String street;
	public String city;
	public Integer pincode;
	public String state;
	public String country;
	public String jobType;
	public String salaryRange;
	public String experience;
	public Job() {
		super();
	}
	public Job(Integer jobId, String title, String companyName, String jobDescription, String skilsRequired,
			String street, String city, Integer pincode, String state, String country, String jobType,
			String salaryRange, String experience) {
		super();
		this.jobId = jobId;
		this.title = title;
		this.companyName = companyName;
		this.jobDescription = jobDescription;
		this.skilsRequired = skilsRequired;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		this.country = country;
		this.jobType = jobType;
		this.salaryRange = salaryRange;
		this.experience = experience;
	}
	
	public Integer getJobId() {
		return jobId;
	}
	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public String getSkilsRequired() {
		return skilsRequired;
	}
	public void setSkilsRequired(String skilsRequired) {
		this.skilsRequired = skilsRequired;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public String getSalaryRange() {
		return salaryRange;
	}
	public void setSalaryRange(String salaryRange) {
		this.salaryRange = salaryRange;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Job [jobId=" + jobId + ", title=" + title + ", companyName=" + companyName + ", jobDescription="
				+ jobDescription + ", skilsRequired=" + skilsRequired + ", street=" + street + ", city=" + city
				+ ", pincode=" + pincode + ", state=" + state + ", country=" + country + ", jobType=" + jobType
				+ ", salaryRange=" + salaryRange + ", experience=" + experience + "]";
	}
	
	

}
