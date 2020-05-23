package com.laptrinhjavaweb.entity;

import com.laptrinhjavaweb.annotation.Column;
import com.laptrinhjavaweb.annotation.Entity;
import com.laptrinhjavaweb.annotation.Table;

@Entity // xac nhan Entity la dai dien cua table sau khi chung minh xong thi quet tiep
@Table(name = "building") // chung minh BuildingEntity la table buiding

public class BuildingEntity {

	@Column(name = "name")
	private String name;

	@Column(name = "ward")
	private String ward;

	@Column(name = "street")
	private String street;

	@Column(name = "id")
	private String id;

	@Column(name = "numberofbasement")
	private int numberofbasement;
	
	@Column(name = "district")
	private String district;
	

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}
	
//	private String idUpDate;
//	
//	public String getIdUpDate() {
//		return idUpDate;
//	}
//
//	public void setIdUpDate(String idUpDate) {
//		this.idUpDate = idUpDate;
//	}
	public int getNumberofbasement() {
		return numberofbasement;
	}

	public void setNumberofbasement(int numberofbasement) {
		this.numberofbasement = numberofbasement;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

}
