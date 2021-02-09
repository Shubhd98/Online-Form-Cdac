package com.app.Registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.Registration.Model.Education;

@Repository
public interface EducationRepository extends JpaRepository<Education,String>{

}
