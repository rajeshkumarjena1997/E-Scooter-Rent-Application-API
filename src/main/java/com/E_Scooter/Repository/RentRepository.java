package com.E_Scooter.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.E_Scooter.Entiti.Rent;

@Repository
public interface RentRepository extends JpaRepository<Rent, Long> {
}
