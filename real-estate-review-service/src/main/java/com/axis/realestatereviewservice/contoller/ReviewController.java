package com.axis.realestatereviewservice.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.realestatereviewservice.entity.Review;
import com.axis.realestatereviewservice.service.ReviewService;

@RestController
public class ReviewController {
	
	@Autowired
	ReviewService reviewService;
	
	@GetMapping("/reviews")
	public List<Review> getReviewList(){
		return reviewService.allReviews();
	}
	
	@GetMapping("/review/{reviewId}")
	public Review getReviewById(long reviewId) {
		return reviewService.findReviewById(reviewId);
	}
	
	@PostMapping("/review")
	public ResponseEntity<String> addNewReview(Review review){
		reviewService.addReview(review);
		return new ResponseEntity<String>("New review added...",HttpStatus.CREATED);
	}
	
	@PutMapping("/review/update/{reviewId}")
	public ResponseEntity<String> updateReview(long reviewId, Review review){
		reviewService.updateReview(reviewId, review);
		return new ResponseEntity<String>("Review with ID: "+reviewId+" updated...",HttpStatus.OK);
	}
	
	@DeleteMapping("/review/delete/{reviewId}")
	public ResponseEntity<String> deleteReview(long reviewId){
		reviewService.deleteReview(reviewId);
		return new ResponseEntity<String>("Review with ID: "+reviewId+" deleted...",HttpStatus.OK);
	}
	
}
