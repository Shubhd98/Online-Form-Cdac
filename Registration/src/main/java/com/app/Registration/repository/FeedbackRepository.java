package com.app.Registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.Registration.Model.Feedback;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback,String>{

}
