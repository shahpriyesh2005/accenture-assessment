package com.accenture.assessment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.assessment.model.Country;
import com.accenture.assessment.repository.CountriesRepository;
import com.accenture.assessment.service.CountriesService;

@Service
public class CountriesServiceImpl implements CountriesService {

	@Autowired
	CountriesRepository countriesRepository;

	@Override
	public List<Country> countriesWithHighestAirports() {
		return countriesRepository.findByHighestAirports();
	}

}
