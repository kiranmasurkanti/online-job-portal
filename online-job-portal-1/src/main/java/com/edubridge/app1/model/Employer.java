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
@Table(name ="employer")
public class Employer {
	
	@Id
	@GeneratedValue
	public Integer employerId;
	public String firstName;
	public String lastName;
	public String emailId;
	public String password;
	public Long contactNo;
	public String street;
	public String city;
	public String state;
	public Integer pincode;
	public String country;
	
	@OneToMany(cascade = CascadeType.ALL,
			fetch = FetchType.LAZY)
	@JoinColumn(name="employerId") 
	private Set<Job> employerjobs;

	public Employer() {
		super();
	}

	public Employer(Integer employerId, String firstName, String lastName, String emailId, String password,
			Long contactNo, String street, String city, String state, Integer pincode, String country,
			Set<Job> employerjobs) {
		super();
		this.employerId = employerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.password = password;
		this.contactNo = contactNo;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.country = country;
		this.employerjobs = employerjobs;
	}

	public Integer getEmployerId() {
		return employerId;
	}

	public void setEmployerId(Integer employerId) {
		this.employerId = employerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getContactNo() {
		return contactNo;
	}

	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Set<Job> getEmployerjobs() {
		return employerjobs;
	}

	public void setEmployerjobs(Set<Job> employerjobs) {
		this.employerjobs = employerjobs;
	}

	@Override
	public String toString() {
		return "Employer [employerId=" + employerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", emailId=" + emailId + ", password=" + password + ", contactNo=" + contactNo + ", street=" + street
				+ ", city=" + city + ", state=" + state + ", pincode=" + pincode + ", country=" + country
				+ ", employerjobs=" + employerjobs + "]";
	}
	
}
