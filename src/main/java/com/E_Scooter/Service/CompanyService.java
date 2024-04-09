package com.E_Scooter.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.E_Scooter.Entiti.Company;
import com.E_Scooter.Exception.ResourceNotFoundException;
import com.E_Scooter.Repository.CompanyRepository;

//CompanyService.java
@Service
public class CompanyService {
	@Autowired
	private CompanyRepository companyRepository;

	public List<Company> getAllCompanies() {
		return companyRepository.findAll();
	}

	public Company getCompanyById(Long id) {
		return companyRepository.findById(id).orElse(null);
	}

	public Company saveCompany(Company company) {
		return companyRepository.save(company);
	}

	public Company updateCompany(Long id, Company company) {
		if (!companyRepository.existsById(id)) {
			throw new ResourceNotFoundException("Company with id " + id + " not found");
		}
		company.setId(id); // Ensure the ID in the request body matches the URL
		return companyRepository.save(company);
	}

	public void deleteCompany(Long id) {
		if (!companyRepository.existsById(id)) {
			throw new ResourceNotFoundException("Company with id " + id + " not found");
		}
		companyRepository.deleteById(id);
	}
}
