package com.E_Scooter.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.E_Scooter.Entiti.Scooter;
import com.E_Scooter.Exception.ResourceNotFoundException;
import com.E_Scooter.Repository.ScooterRepository;

@Service
public class ScooterService {
	@Autowired
	private ScooterRepository scooterRepository;

	public List<Scooter> getAllScooters() {
		return scooterRepository.findAll();
	}

	public Scooter getScooterById(Long id) {
		return scooterRepository.findById(id).orElse(null);
	}

	public Scooter saveScooter(Scooter scooter) {
		return scooterRepository.save(scooter);
	}

	public Scooter updateScooter(Long id, Scooter scooter) {
		if (!scooterRepository.existsById(id)) {
			throw new ResourceNotFoundException("Scooter with id " + id + " not found");
		}
		scooter.setId(id); // Ensure the ID in the request body matches the URL
		return scooterRepository.save(scooter);
	}

	public void deleteScooter(Long id) {
		if (!scooterRepository.existsById(id)) {
			throw new ResourceNotFoundException("Scooter with id " + id + " not found");
		}
		scooterRepository.deleteById(id);
	}
}
