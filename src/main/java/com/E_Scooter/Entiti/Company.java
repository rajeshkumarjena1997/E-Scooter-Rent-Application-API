package com.E_Scooter.Entiti;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String number;
	private int employees;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getEmployees() {
		return employees;
	}

	public void setEmployees(int employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", number=" + number + ", employees=" + employees + "]";
	}

	public Company(Long id, String name, String number, int employees) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.employees = employees;
	}

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Getters and setters
}
