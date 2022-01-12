package com.accenture.assessment.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.accenture.assessment.model.Runway;

@Repository
public interface RunwaysRepository extends CrudRepository<Runway, String> {
	
	public List<Runway> findByAirportRef(String airportRef);

}
