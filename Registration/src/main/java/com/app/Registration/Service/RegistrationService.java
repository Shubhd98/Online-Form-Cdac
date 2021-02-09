package com.app.Registration.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Registration.Model.User;
import com.app.Registration.repository.RegistrationRespository;

@Service
public class RegistrationService {
	@Autowired
	private RegistrationRespository repo;
	
	
	public User saveUser(User user) 
	{
		
		return repo.save(user);
	}
	
	public User FetchUserByEmailid(String email)
 {
		return repo.findByEmailid(email);
	}
	
	public User FetchUserByEmailidAndPassword(String emailid,String password) 
	{
		return repo.findByEmailidAndPassword(emailid,password);
	}
	
}

