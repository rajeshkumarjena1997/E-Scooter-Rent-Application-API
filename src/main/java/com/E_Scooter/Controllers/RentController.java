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

import com.E_Scooter.Entiti.Rent;
import com.E_Scooter.Service.RentService;

//RentController.java
@RestController
@RequestMapping("/api/rents")
public class RentController {
	@Autowired
	private RentService rentService;

	@GetMapping
	public List<Rent> getAllRents() {
		return rentService.getAllRents();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Rent> getRentById(@PathVariable Long id) {
		Rent rent = rentService.getRentById(id);
		return ResponseEntity.ok(rent);
	}

	@PostMapping
	public ResponseEntity<Rent> createRent(@RequestBody Rent rent) {
		Rent savedRent = rentService.saveRent(rent);
		return new ResponseEntity<>(savedRent, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Rent> updateRent(@PathVariable Long id, @RequestBody Rent rent) {
		Rent updatedRent = rentService.updateRent(id, rent);
		return ResponseEntity.ok(updatedRent);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteRent(@PathVariable Long id) {
		rentService.deleteRent(id);
		return ResponseEntity.noContent().build();
	}
}
