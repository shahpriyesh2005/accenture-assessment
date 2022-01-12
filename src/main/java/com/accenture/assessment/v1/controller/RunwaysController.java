package com.accenture.assessment.v1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.assessment.service.RunwaysService;

@RestController
@RequestMapping("/v1/runways")
public class RunwaysController {

	@Autowired
	RunwaysService runwaysService;

	@GetMapping
	public ResponseEntity<Object> listRunwaysByCountry(@RequestParam(required = false) String countryCode,
			@RequestParam(required = false) String countryName) {
		return new ResponseEntity<Object>(runwaysService.runwaysByCountry(countryCode, countryName), HttpStatus.OK);
	}

}
