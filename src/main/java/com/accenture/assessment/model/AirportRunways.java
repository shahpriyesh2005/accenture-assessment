package com.accenture.assessment.model;

import java.util.List;

public class AirportRunways {

	private String name;
	private List<Runway> runways = null;

	public AirportRunways(String name, List<Runway> runways) {
		this.name = name;
		this.runways = runways;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Runway> getRunways() {
		return runways;
	}

	public void setRunways(List<Runway> runways) {
		this.runways = runways;
	}

}
