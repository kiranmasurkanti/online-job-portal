package com.edubridge.app1.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name ="job_category")
public class Category {
	@Id
	@GeneratedValue
	public Integer categoryId;
	public String jobCategory;
	
	@OneToMany(cascade = CascadeType.ALL,
			fetch = FetchType.LAZY)
	@JoinColumn(name="jobCategory")
	private Set<Job> jobCategories;

	public Category() {
		super();
	}

	public Category(Integer categoryId, String jobCategory, String jobType, String salaryRange, String experience,
			Set<Job> jobCategories) {
		super();
		this.categoryId = categoryId;
		this.jobCategory = jobCategory;
		this.jobCategories = jobCategories;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getJobCategory() {
		return jobCategory;
	}

	public void setJobCategory(String jobCategory) {
		this.jobCategory = jobCategory;
	}

	

	public Set<Job> getJobCategories() {
		return jobCategories;
	}

	public void setJobCategories(Set<Job> jobCategories) {
		this.jobCategories = jobCategories;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", jobCategory=" + jobCategory + ", jobType=" +", salaryRange=" + ", experience=" +", jobCategories=" + jobCategories
				+ "]";
	}
	
	
}
