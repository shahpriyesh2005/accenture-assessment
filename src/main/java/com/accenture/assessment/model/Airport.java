package com.accenture.assessment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Airports")
public class Airport {

	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "ident")
	private String ident;

	@Column(name = "type")
	private String type;

	@Column(name = "name")
	private String name;

	@Column(name = "latitude_deg")
	private String latitudeDeg;

	@Column(name = "longitude_deg")
	private String longitudeDeg;

	@Column(name = "elevation_ft")
	private String elevationFt;

	@Column(name = "continent")
	private String continent;

	@Column(name = "iso_country")
	private String isoCountry;

	@Column(name = "iso_region")
	private String isoRegion;

	@Column(name = "municipality")
	private String municipality;

	@Column(name = "scheduled_service")
	private String scheduledService;

	@Column(name = "gps_code")
	private String gpsCode;

	@Column(name = "iata_code")
	private String iataCode;

	@Column(name = "local_code")
	private String localCode;

	@Column(name = "home_link")
	private String homeLink;

	@Column(name = "wikipedia_link")
	private String wikipediaLink;

	@Column(name = "keywords")
	private String keywords;

	public Airport() {
	}

	public Airport(Long id, String ident, String type, String name, String latitudeDeg, String longitudeDeg,
			String elevationFt, String continent, String isoCountry, String isoRegion, String municipality,
			String scheduledService, String gpsCode, String iataCode, String localCode, String homeLink,
			String wikipediaLink, String keywords) {
		this.id = id;
		this.ident = ident;
		this.type = type;
		this.name = name;
		this.latitudeDeg = latitudeDeg;
		this.longitudeDeg = longitudeDeg;
		this.elevationFt = elevationFt;
		this.continent = continent;
		this.isoCountry = isoCountry;
		this.isoRegion = isoRegion;
		this.municipality = municipality;
		this.scheduledService = scheduledService;
		this.gpsCode = gpsCode;
		this.iataCode = iataCode;
		this.localCode = localCode;
		this.homeLink = homeLink;
		this.wikipediaLink = wikipediaLink;
		this.keywords = keywords;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdent() {
		return ident;
	}

	public void setIdent(String ident) {
		this.ident = ident;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLatitudeDeg() {
		return latitudeDeg;
	}

	public void setLatitudeDeg(String latitudeDeg) {
		this.latitudeDeg = latitudeDeg;
	}

	public String getLongitudeDeg() {
		return longitudeDeg;
	}

	public void setLongitudeDeg(String longitudeDeg) {
		this.longitudeDeg = longitudeDeg;
	}

	public String getElevationFt() {
		return elevationFt;
	}

	public void setElevationFt(String elevationFt) {
		this.elevationFt = elevationFt;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getIsoCountry() {
		return isoCountry;
	}

	public void setIsoCountry(String isoCountry) {
		this.isoCountry = isoCountry;
	}

	public String getIsoRegion() {
		return isoRegion;
	}

	public void setIsoRegion(String isoRegion) {
		this.isoRegion = isoRegion;
	}

	public String getMunicipality() {
		return municipality;
	}

	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}

	public String getScheduledService() {
		return scheduledService;
	}

	public void setScheduledService(String scheduledService) {
		this.scheduledService = scheduledService;
	}

	public String getGpsCode() {
		return gpsCode;
	}

	public void setGpsCode(String gpsCode) {
		this.gpsCode = gpsCode;
	}

	public String getIataCode() {
		return iataCode;
	}

	public void setIataCode(String iataCode) {
		this.iataCode = iataCode;
	}

	public String getLocalCode() {
		return localCode;
	}

	public void setLocalCode(String localCode) {
		this.localCode = localCode;
	}

	public String getHomeLink() {
		return homeLink;
	}

	public void setHomeLink(String homeLink) {
		this.homeLink = homeLink;
	}

	public String getWikipediaLink() {
		return wikipediaLink;
	}

	public void setWikipediaLink(String wikipediaLink) {
		this.wikipediaLink = wikipediaLink;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	@Override
	public String toString() {
		return "Airport [id=" + id + ", ident=" + ident + ", type=" + type + ", name=" + name + ", latitudeDeg="
				+ latitudeDeg + ", longitudeDeg=" + longitudeDeg + ", elevationFt=" + elevationFt + ", continent="
				+ continent + ", isoCountry=" + isoCountry + ", isoRegion=" + isoRegion + ", municipality="
				+ municipality + ", scheduledService=" + scheduledService + ", gpsCode=" + gpsCode + ", iataCode="
				+ iataCode + ", localCode=" + localCode + ", homeLink=" + homeLink + ", wikipediaLink=" + wikipediaLink
				+ ", keywords=" + keywords + "]";
	}

}
