package com.accenture.assessment.service;

import com.accenture.assessment.model.Response;

public interface RunwaysService {

	Response runwaysByCountry(String countryCode, String countryName);

}
