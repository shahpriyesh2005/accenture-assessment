package com.accenture.assessment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.accenture.assessment.model.Country;

@Repository
public interface CountriesRepository extends CrudRepository<Country, String> {

	public List<Country> findByCodeStartsWithIgnoreCase(String countryCode);

	public List<Country> findByNameStartsWithIgnoreCase(String countryName);

	@Query(value = "SELECT * FROM COUNTRIES WHERE CODE IN (SELECT ISO_COUNTRY FROM "
			+ "(SELECT ISO_COUNTRY, COUNT(1) FROM AIRPORTS GROUP BY ISO_COUNTRY ORDER BY COUNT(1) DESC) "
			+ "WHERE ROWNUM <= 10)", nativeQuery = true)
	public List<Country> findByHighestAirports();
}
