package com.E_Scooter.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.E_Scooter.Entiti.RentingStation;
import com.E_Scooter.Exception.ResourceNotFoundException;
import com.E_Scooter.Repository.RentingStationRepository;

//RentingStationService.java
@Service
public class RentingStationService {
	@Autowired
	private RentingStationRepository rentingStationRepository;

	public List<RentingStation> getAllRentingStations() {
		return rentingStationRepository.findAll();
	}

	public RentingStation getRentingStationById(Long id) {
		return rentingStationRepository.findById(id).orElse(null);
	}

	public RentingStation saveRentingStation(RentingStation station) {
		return rentingStationRepository.save(station);
	}

	public RentingStation updateRentingStation(Long id, RentingStation station) {
		if (!rentingStationRepository.existsById(id)) {
			throw new ResourceNotFoundException("Renting Station with id " + id + " not found");
		}
		station.setId(id); // Ensure the ID in the request body matches the URL
		return rentingStationRepository.save(station);
	}

	public void deleteRentingStation(Long id) {
		if (!rentingStationRepository.existsById(id)) {
			throw new ResourceNotFoundException("Renting Station with id " + id + " not found");
		}
		rentingStationRepository.deleteById(id);
	}
}
