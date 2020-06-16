package com.laptrinhjavaweb.DTO;

public class BuildingDTO {
	private String name;
	private String ward;
	private String street;
	private String district;
	private int numberofbasement;
	private Long id;
	

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getNumberofbasement() {
		return numberofbasement;
	}

	public void setNumberofbasement(int numberofbasement) {
		this.numberofbasement = numberofbasement;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWard() {
		return ward;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
