package com.app.Registration.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;



@Entity
public class PersonalInfo {

	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private int id;
    private String fname;
	private String lname;
	private String emailid;
	private String fathername;
	private Date dob;
	private String gender;
	private String address;
	private int pincode;
	
	private String city;
	private String state;
	@Lob
	@Column(columnDefinition = "MEDIUMBLOB")
	private String image;
	

	
	
	
	
	public PersonalInfo() {
		
	}



	public PersonalInfo(int id, String fname, String lname, String emailid, String fathername, Date dob, String gender,
			String address, int pincode, String city, String state, String degreename, String university, int yop,
			float percent) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.emailid = emailid;
		this.fathername = fathername;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
    public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
}
