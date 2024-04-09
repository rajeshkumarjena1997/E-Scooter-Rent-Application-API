package com.E_Scooter.Entiti;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Scooter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String country;
	private double price;
	private String status;
	@ManyToOne
	@JoinColumn(name = "renting_station_id")
	private RentingStation scooterIsOnStation;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public RentingStation getScooterIsOnStation() {
		return scooterIsOnStation;
	}

	public void setScooterIsOnStation(RentingStation scooterIsOnStation) {
		this.scooterIsOnStation = scooterIsOnStation;
	}

	@Override
	public String toString() {
		return "Scooter [id=" + id + ", country=" + country + ", price=" + price + ", status=" + status
				+ ", scooterIsOnStation=" + scooterIsOnStation + "]";
	}

	public Scooter(Long id, String country, double price, String status, RentingStation scooterIsOnStation) {
		super();
		this.id = id;
		this.country = country;
		this.price = price;
		this.status = status;
		this.scooterIsOnStation = scooterIsOnStation;
	}

	public Scooter() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Getters and setters
}
