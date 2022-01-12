package com.accenture.assessment.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.accenture.assessment.model.Airport;

@Repository
public interface AirportsRepository extends CrudRepository<Airport, String> {

	public List<Airport> findAirportsByIsoCountry(String isoCountry);

}
