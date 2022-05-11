package com.simplilearn.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.entity.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, String>{
	

}
