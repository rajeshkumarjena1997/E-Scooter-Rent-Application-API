package com.E_Scooter.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.E_Scooter.Entiti.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
}