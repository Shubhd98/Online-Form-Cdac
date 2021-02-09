package com.app.Registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Registration.Model.User;

public interface RegistrationRespository extends JpaRepository<User,Integer>{
	public User findByEmailid(String emailid);
	
	public User findByEmailidAndPassword(String emailid, String password);
	
}
