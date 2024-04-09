package com.E_Scooter.Entiti;

import java.util.Date;

//import java.sql.Date;

import jakarta.persistence.Id;

public class User {
	@Id
	private String embg;
	private String firstname;
	private String lastname;
	private Date dateBorn;
	private String phoneNumber;

	public String getEmbg() {
		return embg;
	}

	public void setEmbg(String embg) {
		this.embg = embg;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public User(String embg, String firstname, String lastname, Date dateBorn, String phoneNumber) {
		super();
		this.embg = embg;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dateBorn = dateBorn;
		this.phoneNumber = phoneNumber;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getDateBorn() {
		return dateBorn;
	}

	public void setDateBorn(Date dateBorn) {
		this.dateBorn = dateBorn;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "User [embg=" + embg + ", firstname=" + firstname + ", lastname=" + lastname + ", dateBorn=" + dateBorn
				+ ", phoneNumber=" + phoneNumber + "]";
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Getters and setters

}
