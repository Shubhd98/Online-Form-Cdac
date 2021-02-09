package com.app.Registration.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.Registration.Model.Centres;

@Repository
public interface CentresRepository extends JpaRepository<Centres,String>{

	@Query("from Centres where id = :x")
	List<Centres> oncat(@Param("x") String y);
	
}
