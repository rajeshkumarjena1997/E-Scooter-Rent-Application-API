package com.E_Scooter.Entiti;

import java.util.Date;

//import java.sql.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Rent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date rentedAt;
	private Date returnedAt;
	@ManyToOne
	@JoinColumn(name = "user_embg")
	private User userRenting;
	@ManyToOne
	@JoinColumn(name = "renting_station_from_id")
	private RentingStation rentingStationFrom;
	@ManyToOne
	@JoinColumn(name = "renting_station_to_id")
	private RentingStation rentingStationTo;
	@ManyToOne
	@JoinColumn(name = "scooter_id")
	private Scooter scooterRented;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getRentedAt() {
		return rentedAt;
	}

	public void setRentedAt(Date rentedAt) {
		this.rentedAt = rentedAt;
	}

	public Date getReturnedAt() {
		return returnedAt;
	}

	public void setReturnedAt(Date returnedAt) {
		this.returnedAt = returnedAt;
	}

	public User getUserRenting() {
		return userRenting;
	}

	public void setUserRenting(User userRenting) {
		this.userRenting = userRenting;
	}

	public RentingStation getRentingStationFrom() {
		return rentingStationFrom;
	}

	public void setRentingStationFrom(RentingStation rentingStationFrom) {
		this.rentingStationFrom = rentingStationFrom;
	}

	public RentingStation getRentingStationTo() {
		return rentingStationTo;
	}

	public void setRentingStationTo(RentingStation rentingStationTo) {
		this.rentingStationTo = rentingStationTo;
	}

	public Scooter getScooterRented() {
		return scooterRented;
	}

	public void setScooterRented(Scooter scooterRented) {
		this.scooterRented = scooterRented;
	}

	@Override
	public String toString() {
		return "Rent [id=" + id + ", rentedAt=" + rentedAt + ", returnedAt=" + returnedAt + ", userRenting="
				+ userRenting + ", rentingStationFrom=" + rentingStationFrom + ", rentingStationTo=" + rentingStationTo
				+ ", scooterRented=" + scooterRented + "]";
	}

	public Rent(Long id, Date rentedAt, Date returnedAt, User userRenting, RentingStation rentingStationFrom,
			RentingStation rentingStationTo, Scooter scooterRented) {
		super();
		this.id = id;
		this.rentedAt = rentedAt;
		this.returnedAt = returnedAt;
		this.userRenting = userRenting;
		this.rentingStationFrom = rentingStationFrom;
		this.rentingStationTo = rentingStationTo;
		this.scooterRented = scooterRented;
	}

	public Rent() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Getters and setters

}
