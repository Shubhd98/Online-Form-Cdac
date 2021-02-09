package com.app.Registration.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Feedback {

	@Id
	public String Fullname;
	public String emailid;
	public String msg;
	
	
	
	
	public Feedback(String fullname, String emailid, String msg) {
		super();
		Fullname = fullname;
		this.emailid = emailid;
		this.msg = msg;
	}
	
	
	public Feedback() {
		
	}


	public String getFullname() {
		return Fullname;
	}
	public void setFullname(String fullname) {
		Fullname = fullname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
