package com.E_Scooter.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.E_Scooter.Entiti.RentingStation;

@Repository
public interface RentingStationRepository extends JpaRepository<RentingStation, Long> {
}
