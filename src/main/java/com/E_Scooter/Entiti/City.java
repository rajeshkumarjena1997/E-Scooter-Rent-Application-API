package com.E_Scooter.Entiti;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class City {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;

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

	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + "]";
	}

	public City(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Getters and setters
}
