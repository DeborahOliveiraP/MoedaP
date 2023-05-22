package com.cambio.moeda.repository;


import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cambio.moeda.entities.PairEntity;

@Repository
public interface SalvarRepository extends JpaRepository<PairEntity, Long> {

	
	

}
