package com.E_Scooter.Entiti;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class RentingStation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int numberOfEScooters;
	@ManyToOne
	@JoinColumn(name = "company_id")
	private Company company;
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;

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

	public int getNumberOfEScooters() {
		return numberOfEScooters;
	}

	public void setNumberOfEScooters(int numberOfEScooters) {
		this.numberOfEScooters = numberOfEScooters;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "RentingStation [id=" + id + ", name=" + name + ", numberOfEScooters=" + numberOfEScooters + ", company="
				+ company + ", city=" + city + "]";
	}

	public RentingStation(Long id, String name, int numberOfEScooters, Company company, City city) {
		super();
		this.id = id;
		this.name = name;
		this.numberOfEScooters = numberOfEScooters;
		this.company = company;
		this.city = city;
	}

	public RentingStation() {
		super();
		// TODO Auto-generated constructor stub
	}

}
