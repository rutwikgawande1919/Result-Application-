package entity;

import repository.Studentrepository;

public class Student {

	private int id;
	private String firstname;
	private String lastname;

	private int mathobtained;
	private int scienceobtained;
	private int englishobtained;
	public  static String standard ="10th";

	// TOtal marks of each object is 100
//set id	
	public void setId(int id) {
		this.id = id;
	}
//get id	
	public int getId() {
		return id;
	}
	
//set firstname	
	public void setFirstname(String firstname) {
		this.firstname =firstname;
	}
//get firstname
	public String getFirstname() {
		return firstname;
	}
	
//set lastname
	public void setLastname(String lastname) {
		this.lastname =lastname;
	}
//get lastname
	public String getLastname() {
		return lastname;
	}
	
//set mathobtained	
	public void setMathobtained(int mathobtained) {
		this.mathobtained=mathobtained;
	}
//get mathobtained
	public int getMathobtained() {
		return mathobtained;
	}
	
//set scienceobtained	
	public void setScienceobtained(int scienceobtained) {
		this.scienceobtained=scienceobtained;
	}
//get scienceobtained
	public int getScienceobtained() {
		return scienceobtained;
	}
	
//set englishobtained
	public void setEnglishobtained(int englishobtained) {
		this.englishobtained = englishobtained;
	}
//get englishobtained
	public int getEnglishobtained() {
		return englishobtained;
	}
	
	
}
