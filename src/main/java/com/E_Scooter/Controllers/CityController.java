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

import com.E_Scooter.Entiti.City;
import com.E_Scooter.Service.CityService;

//CityController.java
@RestController
@RequestMapping("/api/cities")
public class CityController {
	@Autowired
	private CityService cityService;

	@GetMapping
	public List<City> getAllCities() {
		return cityService.getAllCities();
	}

	@GetMapping("/{id}")
	public ResponseEntity<City> getCityById(@PathVariable Long id) {
		City city = cityService.getCityById(id);
		return ResponseEntity.ok(city);
	}

	@PostMapping
	public ResponseEntity<City> createCity(@RequestBody City city) {
		City savedCity = cityService.saveCity(city);
		return new ResponseEntity<>(savedCity, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<City> updateCity(@PathVariable Long id, @RequestBody City city) {
		City updatedCity = cityService.updateCity(id, city);
		return ResponseEntity.ok(updatedCity);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteCity(@PathVariable Long id) {
		cityService.deleteCity(id);
		return ResponseEntity.noContent().build();
	}
}
