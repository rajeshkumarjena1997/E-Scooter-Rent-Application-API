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

import com.E_Scooter.Entiti.Scooter;
import com.E_Scooter.Service.ScooterService;

//ScooterController.java
@RestController
@RequestMapping("/api/scooters")
public class ScooterController {
	@Autowired
	private ScooterService scooterService;

	@GetMapping
	public List<Scooter> getAllScooters() {
		return scooterService.getAllScooters();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Scooter> getScooterById(@PathVariable Long id) {
		Scooter scooter = scooterService.getScooterById(id);
		return ResponseEntity.ok(scooter);
	}

	@PostMapping
	public ResponseEntity<Scooter> createScooter(@RequestBody Scooter scooter) {
		Scooter savedScooter = scooterService.saveScooter(scooter);
		return new ResponseEntity<>(savedScooter, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Scooter> updateScooter(@PathVariable Long id, @RequestBody Scooter scooter) {
		Scooter updatedScooter = scooterService.updateScooter(id, scooter);
		return ResponseEntity.ok(updatedScooter);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteScooter(@PathVariable Long id) {
		scooterService.deleteScooter(id);
		return ResponseEntity.noContent().build();
	}
}
