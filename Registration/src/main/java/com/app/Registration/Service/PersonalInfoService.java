package com.app.Registration.Service;

import java.io.IOException;
import java.util.Base64;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.app.Registration.Model.PersonalInfo;
import com.app.Registration.repository.PersonalInfoRepositry;

@Service
public class PersonalInfoService 
{
	@Autowired
	private PersonalInfoRepositry personalrepo;
	
	public void savePersonalInfoToDB(MultipartFile file, String fname,String lname, String emailid,String fathername, Date dob, String gender, String address,int pincode,String city,String state,String degreename,String university,int yop,float percent) 
	{
		PersonalInfo p =new PersonalInfo();
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		if(fileName.contains(".."))
		{
			System.out.println("not a a valid file");
		}
		try {
			p.setImage(Base64.getEncoder().encodeToString(file.getBytes()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		p.setAddress(address);
		p.setCity(city);
		p.setDegreename(degreename);
		p.setDob(dob);
		p.setEmailid(emailid);
		p.setFathername(fathername);
		p.setFname(fname);
		p.setGender(gender);
		p.setLname(lname);
		p.setPercent(percent);
		p.setPincode(pincode);
		p.setState(state);
		p.setUniversity(university);
		p.setYop(yop);
		
		personalrepo.save(p);
		
	}
	
	/*public PersonalInfo savePersonalInfoToDB(PersonalInfo personalinfo) {
		
		return personalrepo.save(personalinfo);
		
	}
	*/
	public List<PersonalInfo> f3(int y)
	{
		return personalrepo.oncat(y);
		
	}
}
