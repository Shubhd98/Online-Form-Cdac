package com.app.Registration.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.Registration.Model.Centres;
import com.app.Registration.repository.CentresRepository;




public class CentresService {
	
@Autowired	
private CentresRepository centresrepo;

	
	
	public List<Centres> Search(String y)
	{
		return centresrepo.oncat(y);
		
	}

}
