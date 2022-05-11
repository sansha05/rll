package com.simplilearn.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.simplilearn.entity.Review;
import com.simplilearn.service.ReviewService;

@RestController
@RequestMapping("/api/review")
public class ReviewController {

	@Autowired
	ReviewService reviewservice;
	
	@PostMapping("/add")
	public ResponseEntity<Review> findbyname(@RequestBody Review review)
	{
		Review obj=reviewservice.save(review);
		if(obj!=null)
			return new ResponseEntity<Review>(obj,HttpStatus.CREATED);
		else
			return new ResponseEntity<Review>(obj,HttpStatus.INTERNAL_SERVER_ERROR);	        	
	}
	
	@GetMapping("/list")
	public List<Review> getAll() 
	{
		return reviewservice.getAllreview();
	}
}
