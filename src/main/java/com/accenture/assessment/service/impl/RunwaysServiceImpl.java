package com.accenture.assessment.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.accenture.assessment.model.Airport;
import com.accenture.assessment.model.AirportRunways;
import com.accenture.assessment.model.Country;
import com.accenture.assessment.model.Response;
import com.accenture.assessment.model.Runway;
import com.accenture.assessment.repository.AirportsRepository;
import com.accenture.assessment.repository.CountriesRepository;
import com.accenture.assessment.repository.RunwaysRepository;
import com.accenture.assessment.service.RunwaysService;

@Service
public class RunwaysServiceImpl implements RunwaysService {

	@Autowired
	CountriesRepository countriesRepository;

	@Autowired
	AirportsRepository airportsRepository;

	@Autowired
	RunwaysRepository runwaysRepository;

	@Override
	public Response runwaysByCountry(String countryCode, String countryName) {
		List<Country> countries = null;
		List<Airport> airports = null;
		List<Runway> runways = null;
		List<AirportRunways> listAirportRunways = new ArrayList<>();

		if (StringUtils.isNotBlank(countryCode)) {
			countries = countriesRepository.findByCodeStartsWithIgnoreCase(countryCode);
		} else if (StringUtils.isNotBlank(countryName)) {
			countries = countriesRepository.findByNameStartsWithIgnoreCase(countryName);
		} else {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
		}

		if (countries == null || countries.size() == 0) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
		} else if (countries != null && countries.size() > 1) {
			throw new ResponseStatusException(HttpStatus.MULTIPLE_CHOICES);
		} else {
			countryCode = countries.get(0).getCode();
			countryName = countries.get(0).getName();
		}

		airports = airportsRepository.findAirportsByIsoCountry(countryCode);

		for (Airport airport : airports) {
			runways = new ArrayList<Runway>();
			runways = runwaysRepository.findByAirportRef(airport.getId().toString());

			AirportRunways airportRunways = new AirportRunways(airport.getName(), runways);
			listAirportRunways.add(airportRunways);
		}

		return new Response(countryName, listAirportRunways);
	}
}
