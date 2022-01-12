package com.accenture.assessment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Countries")
public class Country {

	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "continent")
	private String continent;
	
	@Column(name = "wikipedia_link")
	private String wikipediaLink;
	
	@Column(name = "keywords")
	private String keywords;

	public Country() {
	}

	public Country(Long id, String code, String name, String continent, String wikipediaLink, String keywords) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.continent = continent;
		this.wikipediaLink = wikipediaLink;
		this.keywords = keywords;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String isWikipediaLink() {
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
		return "Country [id=" + id + ", code=" + code + ", name=" + name + ", continent=" + continent
				+ ", wikipediaLink=" + wikipediaLink + ", keywords=" + keywords + "]";
	}

}
