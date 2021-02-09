package com.app.Registration.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Centres {
	
	@Id
	public String City;
	public String Centrename;
	public String Courses;
	
	
	public Centres(String city, String centrename, String courses) {
		super();
		City = city;
		Centrename = centrename;
		Courses = courses;
	}
	public Centres() {
		
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getCentrename() {
		return Centrename;
	}
	public void setCentrename(String centrename) {
		Centrename = centrename;
	}
	public String getCourses() {
		return Courses;
	}
	public void setCourses(String courses) {
		Courses = courses;
	}
	

}
