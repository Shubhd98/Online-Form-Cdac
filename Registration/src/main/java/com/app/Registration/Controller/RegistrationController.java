package com.app.Registration.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.Registration.Model.PersonalInfo;
import com.app.Registration.Model.User;
import com.app.Registration.Service.RegistrationService;
import com.app.Registration.repository.PersonalInfoRepositry;


@RestController
public class RegistrationController {
	
	
	@Autowired
	private RegistrationService service;
	
	@Autowired
	private PersonalInfoRepositry personalrepo;
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/registration")
	public User registerUser(@RequestBody User user) throws Exception 
	{
		
		String tempEmailId= user.getEmailid();
		
		if(tempEmailId!=null&&!"".equals(tempEmailId)) 
		{
			User userObj=service.FetchUserByEmailid(tempEmailId);
			if(userObj !=null) 
			{
				throw new Exception("user with "+ tempEmailId +" is already exist");
			}
		}
		User userObj =null;
		userObj=service.saveUser(user);
		return userObj;
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/login")
	public User loginuser(@RequestBody User user) throws Exception 
	{
		String tempEmailId= user.getEmailid();
		String tempPass = user.getPassword();
		
		User userObj=null;
	
		if(tempEmailId!=null&& tempPass!=null)
		{
			userObj= service.FetchUserByEmailidAndPassword(tempEmailId, tempPass);
		}
		if(userObj==null)
		{
			throw new Exception("user does not exist");
		}
		return userObj;
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/personalinfo")
	public PersonalInfo insertdata(@RequestBody PersonalInfo personal)
	{
		return personalrepo.save(personal);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/ms")
	public List<PersonalInfo> f3(@RequestParam("x") int y)
	{
		return personalrepo.oncat(y);
		
	}
	
}
