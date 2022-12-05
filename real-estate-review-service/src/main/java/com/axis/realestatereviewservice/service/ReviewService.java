package com.axis.realestatereviewservice.service;

import java.util.List;

import com.axis.realestatereviewservice.entity.Review;

public interface ReviewService {
	
	List<Review> allReviews();
	
	Review findReviewById(long reviewId);
	
	void addReview(Review review);
	
	void updateReview(long reviewId, Review updatedReview);
	
	void deleteReview(long reviewId);
	
}
