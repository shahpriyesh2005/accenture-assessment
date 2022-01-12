package com.accenture.assessment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Runways")
public class Runway {

	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "airport_ref")
	private String airportRef;

	@Column(name = "airport_ident")
	private String airportIdent;

	@Column(name = "length_ft")
	private String lengthFt;

	@Column(name = "width_ft")
	private String widthFt;

	@Column(name = "surface")
	private String surface;

	@Column(name = "lighted")
	private String lighted;

	@Column(name = "closed")
	private String closed;

	@Column(name = "le_ident")
	private String leIdent;

	@Column(name = "le_latitude_deg")
	private String leLatitudeDeg;

	@Column(name = "le_longitude_deg")
	private String leLongitudeDeg;

	@Column(name = "le_elevation_ft")
	private String leElevationFt;

	@Column(name = "le_heading_degT")
	private String leHeadingDegT;

	@Column(name = "le_displaced_threshold_ft")
	private String leDisplacedThresholdFt;

	@Column(name = "he_ident")
	private String heIdent;

	@Column(name = "he_latitude_deg")
	private String heLatitudeDeg;

	@Column(name = "he_longitude_deg")
	private String heLongitudeDeg;

	@Column(name = "he_elevation_ft")
	private String heElevationFt;

	@Column(name = "he_heading_degT")
	private String heHeadingDegT;

	@Column(name = "he_displaced_threshold_ft")
	private String heDisplacedThresholdFt;

	public Runway() {
	}

	public Runway(Long id, String airportRef, String airportIdent, String lengthFt, String widthFt, String surface,
			String lighted, String closed, String leIdent, String leLatitudeDeg, String leLongitudeDeg,
			String leElevationFt, String leHeadingDegT, String leDisplacedThresholdFt, String heIdent,
			String heLatitudeDeg, String heLongitudeDeg, String heElevationFt, String heHeadingDegT,
			String heDisplacedThresholdFt) {
		this.id = id;
		this.airportRef = airportRef;
		this.airportIdent = airportIdent;
		this.lengthFt = lengthFt;
		this.widthFt = widthFt;
		this.surface = surface;
		this.lighted = lighted;
		this.closed = closed;
		this.leIdent = leIdent;
		this.leLatitudeDeg = leLatitudeDeg;
		this.leLongitudeDeg = leLongitudeDeg;
		this.leElevationFt = leElevationFt;
		this.leHeadingDegT = leHeadingDegT;
		this.leDisplacedThresholdFt = leDisplacedThresholdFt;
		this.heIdent = heIdent;
		this.heLatitudeDeg = heLatitudeDeg;
		this.heLongitudeDeg = heLongitudeDeg;
		this.heElevationFt = heElevationFt;
		this.heHeadingDegT = heHeadingDegT;
		this.heDisplacedThresholdFt = heDisplacedThresholdFt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAirportRef() {
		return airportRef;
	}

	public void setAirportRef(String airportRef) {
		this.airportRef = airportRef;
	}

	public String getAirportIdent() {
		return airportIdent;
	}

	public void setAirportIdent(String airportIdent) {
		this.airportIdent = airportIdent;
	}

	public String getLengthFt() {
		return lengthFt;
	}

	public void setLengthFt(String lengthFt) {
		this.lengthFt = lengthFt;
	}

	public String getWidthFt() {
		return widthFt;
	}

	public void setWidthFt(String widthFt) {
		this.widthFt = widthFt;
	}

	public String getSurface() {
		return surface;
	}

	public void setSurface(String surface) {
		this.surface = surface;
	}

	public String getLighted() {
		return lighted;
	}

	public void setLighted(String lighted) {
		this.lighted = lighted;
	}

	public String getClosed() {
		return closed;
	}

	public void setClosed(String closed) {
		this.closed = closed;
	}

	public String getLeIdent() {
		return leIdent;
	}

	public void setLeIdent(String leIdent) {
		this.leIdent = leIdent;
	}

	public String getLeLatitudeDeg() {
		return leLatitudeDeg;
	}

	public void setLeLatitudeDeg(String leLatitudeDeg) {
		this.leLatitudeDeg = leLatitudeDeg;
	}

	public String getLeLongitudeDeg() {
		return leLongitudeDeg;
	}

	public void setLeLongitudeDeg(String leLongitudeDeg) {
		this.leLongitudeDeg = leLongitudeDeg;
	}

	public String getLeElevationFt() {
		return leElevationFt;
	}

	public void setLeElevationFt(String leElevationFt) {
		this.leElevationFt = leElevationFt;
	}

	public String getLeHeadingDegT() {
		return leHeadingDegT;
	}

	public void setLeHeadingDegT(String leHeadingDegT) {
		this.leHeadingDegT = leHeadingDegT;
	}

	public String getLeDisplacedThresholdFt() {
		return leDisplacedThresholdFt;
	}

	public void setLeDisplacedThresholdFt(String leDisplacedThresholdFt) {
		this.leDisplacedThresholdFt = leDisplacedThresholdFt;
	}

	public String getHeIdent() {
		return heIdent;
	}

	public void setHeIdent(String heIdent) {
		this.heIdent = heIdent;
	}

	public String getHeLatitudeDeg() {
		return heLatitudeDeg;
	}

	public void setHeLatitudeDeg(String heLatitudeDeg) {
		this.heLatitudeDeg = heLatitudeDeg;
	}

	public String getHeLongitudeDeg() {
		return heLongitudeDeg;
	}

	public void setHeLongitudeDeg(String heLongitudeDeg) {
		this.heLongitudeDeg = heLongitudeDeg;
	}

	public String getHeElevationFt() {
		return heElevationFt;
	}

	public void setHeElevationFt(String heElevationFt) {
		this.heElevationFt = heElevationFt;
	}

	public String getHeHeadingDegT() {
		return heHeadingDegT;
	}

	public void setHeHeadingDegT(String heHeadingDegT) {
		this.heHeadingDegT = heHeadingDegT;
	}

	public String getHeDisplacedThresholdFt() {
		return heDisplacedThresholdFt;
	}

	public void setHeDisplacedThresholdFt(String heDisplacedThresholdFt) {
		this.heDisplacedThresholdFt = heDisplacedThresholdFt;
	}

	@Override
	public String toString() {
		return "Runway [id=" + id + ", airportRef=" + airportRef + ", airportIdent=" + airportIdent + ", lengthFt="
				+ lengthFt + ", widthFt=" + widthFt + ", surface=" + surface + ", lighted=" + lighted + ", closed="
				+ closed + ", leIdent=" + leIdent + ", leLatitudeDeg=" + leLatitudeDeg + ", leLongitudeDeg="
				+ leLongitudeDeg + ", leElevationFt=" + leElevationFt + ", leHeadingDegT=" + leHeadingDegT
				+ ", leDisplacedThresholdFt=" + leDisplacedThresholdFt + ", heIdent=" + heIdent + ", heLatitudeDeg="
				+ heLatitudeDeg + ", heLongitudeDeg=" + heLongitudeDeg + ", heElevationFt=" + heElevationFt
				+ ", heHeadingDegT=" + heHeadingDegT + ", heDisplacedThresholdFt=" + heDisplacedThresholdFt + "]";
	}

}
