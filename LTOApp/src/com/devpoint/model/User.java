package com.devpoint.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(
		name = "user", catalog = "lto_app",
		uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	@Column( name = "id" )
	private String id;
	
	@Column( name = "first_name" )
	private String firstName;
	
	@Column( name = "last_name" )
	private String lastName;
	
	@Column( name = "address" )
	private String address;
	
	@Column( name = "tin" )
	private String tin;
	
	@Column( name = "telephone_number" )
	private String telephoneNumber;
	
	@Column( name = "nationality" )
	private String nationality;
	
	@Column( name = "gender" )
	private String gender;

	@Column( name = "birth_date" )
	private Date birthDate;
	
	@Column( name = "height" )
	private Double height;
	
	@Column( name = "weight" )
	private Double weight;
	
	@Column( name = "type_of_application" )
	private String typeOfApplication;
	
	@Column( name = "type_of_license" )
	private String typeOfLicense;
	
	@Column( name = "driving_skills_from" )
	private String drivingSkillsFrom;
	
	@Column( name = "educational_attainment" )
	private String educationalAttainment;
	
	@Column( name = "blood_type" )
	private String bloodType;
	
	@Column( name = "organ_donor" )
	private boolean organDonor;
	
	@Column( name = "civil_status" )
	private String civilStatus;
	
	@Column( name = "hair" )
	private String hair;
	
	@Column( name = "eyes" )
	private String eyes;
	
	@Column( name = "built" )
	private String built;
	
	@Column( name = "complexion" )
	private String complexion;
	
	@Column( name = "birth_place" )
	private String birthPlace;
	
	@Column( name = "fathers_name" )
	private String fathersName;
	
	@Column( name = "mothers_name" )
	private String mothersName;
	
	@Column( name = "spouse_name" )
	private String spouseName;
	
	@Column( name = "employers_business_name" )
	private String employersBusinessName;
	
	@Column( name = "employers_telephone_number" )
	private String employersTelNumber;
	
	@Column( name = "business_address" )
	private String businessAddress;
	
	@Column( name = "previous_name" )
	private String previousName;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTin() {
		return tin;
	}
	public void setTin(String tin) {
		this.tin = tin;
	}
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public String getTypeOfApplication() {
		return typeOfApplication;
	}
	public void setTypeOfApplication(String typeOfApplication) {
		this.typeOfApplication = typeOfApplication;
	}
	public String getTypeOfLicense() {
		return typeOfLicense;
	}
	public void setTypeOfLicense(String typeOfLicense) {
		this.typeOfLicense = typeOfLicense;
	}
	public String getDrivingSkillsFrom() {
		return drivingSkillsFrom;
	}
	public void setDrivingSkillsFrom(String drivingSkillsFrom) {
		this.drivingSkillsFrom = drivingSkillsFrom;
	}
	public String getEducationalAttainment() {
		return educationalAttainment;
	}
	public void setEducationalAttainment(String educationalAttainment) {
		this.educationalAttainment = educationalAttainment;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	public boolean isOrganDonor() {
		return organDonor;
	}
	public void setOrganDonor(boolean organDonor) {
		this.organDonor = organDonor;
	}
	public String getCivilStatus() {
		return civilStatus;
	}
	public void setCivilStatus(String civilStatus) {
		this.civilStatus = civilStatus;
	}
	public String getHair() {
		return hair;
	}
	public void setHair(String hair) {
		this.hair = hair;
	}
	public String getEyes() {
		return eyes;
	}
	public void setEyes(String eyes) {
		this.eyes = eyes;
	}
	public String getBuilt() {
		return built;
	}
	public void setBuilt(String built) {
		this.built = built;
	}
	public String getComplexion() {
		return complexion;
	}
	public void setComplexion(String complexion) {
		this.complexion = complexion;
	}
	public String getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	public String getFathersName() {
		return fathersName;
	}
	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}
	public String getMothersName() {
		return mothersName;
	}
	public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}
	public String getSpouseName() {
		return spouseName;
	}
	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}
	public String getEmployersBusinessName() {
		return employersBusinessName;
	}
	public void setEmployersBusinessName(String employersBusinessName) {
		this.employersBusinessName = employersBusinessName;
	}
	public String getEmployersTelNumber() {
		return employersTelNumber;
	}
	public void setEmployersTelNumber(String employersTelNumber) {
		this.employersTelNumber = employersTelNumber;
	}
	public String getBusinessAddress() {
		return businessAddress;
	}
	public void setBusinessAddress(String businessAddress) {
		this.businessAddress = businessAddress;
	}
	public String getPreviousName() {
		return previousName;
	}
	public void setPreviousName(String previousName) {
		this.previousName = previousName;
	}
	
	public User(){
		
	}
	
	public User(String id, String firstName, String lastName, String address,
			String tin, String telephoneNumber, String nationality,
			String gender, Date birthDate, Double height, Double weight,
			String typeOfApplication, String typeOfLicense,
			String drivingSkillsFrom, String educationalAttainment,
			String bloodType, boolean organDonor, String civilStatus,
			String hair, String eyes, String built, String complexion,
			String birthPlace, String fathersName, String mothersName,
			String spouseName, String employersBusinessName,
			String employersTelNumber, String businessAddress,
			String previousName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.tin = tin;
		this.telephoneNumber = telephoneNumber;
		this.nationality = nationality;
		this.gender = gender;
		this.birthDate = birthDate;
		this.height = height;
		this.weight = weight;
		this.typeOfApplication = typeOfApplication;
		this.typeOfLicense = typeOfLicense;
		this.drivingSkillsFrom = drivingSkillsFrom;
		this.educationalAttainment = educationalAttainment;
		this.bloodType = bloodType;
		this.organDonor = organDonor;
		this.civilStatus = civilStatus;
		this.hair = hair;
		this.eyes = eyes;
		this.built = built;
		this.complexion = complexion;
		this.birthPlace = birthPlace;
		this.fathersName = fathersName;
		this.mothersName = mothersName;
		this.spouseName = spouseName;
		this.employersBusinessName = employersBusinessName;
		this.employersTelNumber = employersTelNumber;
		this.businessAddress = businessAddress;
		this.previousName = previousName;
	}
}
