package com.E_Scooter.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.E_Scooter.Entiti.City;
import com.E_Scooter.Exception.ResourceNotFoundException;
import com.E_Scooter.Repository.CityRepository;

@Service
public class CityService {
	@Autowired
	private CityRepository cityRepository;

	public List<City> getAllCities() {
		return cityRepository.findAll();
	}

	public City getCityById(Long id) {
		return cityRepository.findById(id).orElse(null);
	}

	public City saveCity(City city) {
		return cityRepository.save(city);
	}

	public City updateCity(Long id, City city) {
		if (!cityRepository.existsById(id)) {
			throw new ResourceNotFoundException("City with id " + id + " not found");
		}
		city.setId(id); // Ensure the ID in the request body matches the URL
		return cityRepository.save(city);
	}

	public void deleteCity(Long id) {
		if (!cityRepository.existsById(id)) {
			throw new ResourceNotFoundException("City with id " + id + " not found");
		}
		cityRepository.deleteById(id);
	}
}
