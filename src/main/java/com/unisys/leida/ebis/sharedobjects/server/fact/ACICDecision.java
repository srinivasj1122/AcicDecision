package com.unisys.leida.ebis.sharedobjects.server.fact;

import java.io.Serializable;
import java.util.List;

@javax.persistence.Entity
public class ACICDecision implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "ACIC_DECISION_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "ACIC_DECISION_ID_GENERATOR", sequenceName = "ACIC_DECISION_ID_SEQ")
	private java.lang.Long id;

	private java.lang.String nationality;

	private int age;

	private java.lang.String gender;

	private java.lang.String acquisitionLocation;

	private java.lang.String result = "NONE";

	private List<String> acquisitionLocationList;

	private List<String> nationalityList;

	private List<String> genderList;

	public java.lang.Long getId() {
		return id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getNationality() {
		return nationality;
	}

	public void setNationality(java.lang.String nationality) {
		this.nationality = nationality;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public java.lang.String getGender() {
		return gender;
	}

	public void setGender(java.lang.String gender) {
		this.gender = gender;
	}

	public java.lang.String getAcquisitionLocation() {
		return acquisitionLocation;
	}

	public void setAcquisitionLocation(java.lang.String acquisitionLocation) {
		this.acquisitionLocation = acquisitionLocation;
	}

	public java.lang.String getResult() {
		return result;
	}

	public void setResult(java.lang.String result) {
		this.result = result;
	}

	public List<String> getAcquisitionLocationList() {
		return acquisitionLocationList;
	}

	public void setAcquisitionLocationList(List<String> acquisitionLocationList) {
		this.acquisitionLocationList = acquisitionLocationList;
	}

	public List<String> getNationalityList() {
		return nationalityList;
	}

	public void setNationalityList(List<String> nationalityList) {
		this.nationalityList = nationalityList;
	}

	public List<String> getGenderList() {
		return genderList;
	}

	public void setGenderList(List<String> genderList) {
		this.genderList = genderList;
	}

	public ACICDecision(Long id, String nationality, int age, String gender, String acquisitionLocation, String result,
			List<String> acquisitionLocationList, List<String> nationalityList, List<String> genderList) {
		super();
		this.id = id;
		this.nationality = nationality;
		this.age = age;
		this.gender = gender;
		this.acquisitionLocation = acquisitionLocation;
		this.result = result;
		this.acquisitionLocationList = acquisitionLocationList;
		this.nationalityList = nationalityList;
		this.genderList = genderList;
	}

	public ACICDecision() {
		super();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ACICDecision [id=");
		builder.append(id);
		builder.append(", nationality=");
		builder.append(nationality);
		builder.append(", age=");
		builder.append(age);
		builder.append(", gender=");
		builder.append(gender);
		builder.append(", acquisitionLocation=");
		builder.append(acquisitionLocation);
		builder.append(", result=");
		builder.append(result);
		builder.append(", acquisitionLocationList=");
		builder.append(acquisitionLocationList);
		builder.append(", nationalityList=");
		builder.append(nationalityList);
		builder.append(", genderList=");
		builder.append(genderList);
		builder.append("]");
		return builder.toString();
	}

}