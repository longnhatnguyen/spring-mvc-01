package com.laptrinhjavaweb.DTO;

public class BuildingDTO {
	private String name;
	private String ward;
	private String street;
	private String district;
	private int numberofbasement;
	private String id;
	

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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
