package com.E_Scooter.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.E_Scooter.Entiti.RentingStation;
import com.E_Scooter.Service.RentingStationService;

//RentingStationController.java
@RestController
@RequestMapping("/api/renting-stations")
public class RentingStationController {
	@Autowired
	private RentingStationService rentingStationService;

	@GetMapping
	public List<RentingStation> getAllRentingStations() {
		return rentingStationService.getAllRentingStations();
	}

	@GetMapping("/{id}")
	public ResponseEntity<RentingStation> getRentingStationById(@PathVariable Long id) {
		RentingStation station = rentingStationService.getRentingStationById(id);
		return ResponseEntity.ok(station);
	}

	@PostMapping
	public ResponseEntity<RentingStation> createRentingStation(@RequestBody RentingStation station) {
		RentingStation savedStation = rentingStationService.saveRentingStation(station);
		return new ResponseEntity<>(savedStation, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<RentingStation> updateRentingStation(@PathVariable Long id,
			@RequestBody RentingStation station) {
		RentingStation updatedStation = rentingStationService.updateRentingStation(id, station);
		return ResponseEntity.ok(updatedStation);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteRentingStation(@PathVariable Long id) {
		rentingStationService.deleteRentingStation(id);
		return ResponseEntity.noContent().build();
	}
}
