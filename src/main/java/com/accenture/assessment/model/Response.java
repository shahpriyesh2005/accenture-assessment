package com.accenture.assessment.model;

import java.util.List;

public class Response {

	private String country;
	private List<AirportRunways> airportRunways = null;

	public Response(String country, List<AirportRunways> airportRunways) {
		this.country = country;
		this.airportRunways = airportRunways;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<AirportRunways> getAirportRunways() {
		return airportRunways;
	}

	public void setAirportRunways(List<AirportRunways> airportRunways) {
		this.airportRunways = airportRunways;
	}

}
