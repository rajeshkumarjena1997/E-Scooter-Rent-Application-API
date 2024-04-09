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

import com.E_Scooter.Entiti.Company;
import com.E_Scooter.Service.CompanyService;

//CompanyController.java
@RestController
@RequestMapping("/api/companies")
public class CompanyController {
	@Autowired
	private CompanyService companyService;

	@GetMapping
	public List<Company> getAllCompanies() {
		return companyService.getAllCompanies();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Company> getCompanyById(@PathVariable Long id) {
		Company company = companyService.getCompanyById(id);
		return ResponseEntity.ok(company);
	}

	@PostMapping
	public ResponseEntity<Company> createCompany(@RequestBody Company company) {
		Company savedCompany = companyService.saveCompany(company);
		return new ResponseEntity<>(savedCompany, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Company> updateCompany(@PathVariable Long id, @RequestBody Company company) {
		Company updatedCompany = companyService.updateCompany(id, company);
		return ResponseEntity.ok(updatedCompany);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteCompany(@PathVariable Long id) {
		companyService.deleteCompany(id);
		return ResponseEntity.noContent().build();
	}
}
