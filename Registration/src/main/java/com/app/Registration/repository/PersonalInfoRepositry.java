package com.app.Registration.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.Registration.Model.PersonalInfo;

@Repository
public interface PersonalInfoRepositry extends JpaRepository<PersonalInfo,Integer>
{

	@Query("from PersonalInfo where id = :x")
	List<PersonalInfo> oncat(@Param("x") int y);
	
}
