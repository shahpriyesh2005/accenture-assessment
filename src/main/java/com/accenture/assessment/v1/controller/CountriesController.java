package com.accenture.assessment.v1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.assessment.service.CountriesService;

@RestController
@RequestMapping("/v1/countries")
public class CountriesController {

	@Autowired
	CountriesService countryService;

	@GetMapping(value = "/highestAirports")
	public ResponseEntity<Object> countriesWithHighestAirports() {
		return new ResponseEntity<Object>(countryService.countriesWithHighestAirports(), HttpStatus.OK);
	}
}
