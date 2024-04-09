package com.E_Scooter.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.E_Scooter.Entiti.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
}
