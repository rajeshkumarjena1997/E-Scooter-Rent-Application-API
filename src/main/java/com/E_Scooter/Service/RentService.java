package com.E_Scooter.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.E_Scooter.Entiti.Rent;
import com.E_Scooter.Exception.ResourceNotFoundException;
import com.E_Scooter.Repository.RentRepository;

@Service
public class RentService {
	@Autowired
	private RentRepository rentRepository;

	public List<Rent> getAllRents() {
		return rentRepository.findAll();
	}

	public Rent getRentById(Long id) {
		return rentRepository.findById(id).orElse(null);
	}

	public Rent saveRent(Rent rent) {
		return rentRepository.save(rent);
	}

	public Rent updateRent(Long id, Rent rent) {
		if (!rentRepository.existsById(id)) {
			throw new ResourceNotFoundException("Rent with id " + id + " not found");
		}
		rent.setId(id); // Ensure the ID in the request body matches the URL
		return rentRepository.save(rent);
	}

	public void deleteRent(Long id) {
		if (!rentRepository.existsById(id)) {
			throw new ResourceNotFoundException("Rent with id " + id + " not found");
		}
		rentRepository.deleteById(id);
	}
}
