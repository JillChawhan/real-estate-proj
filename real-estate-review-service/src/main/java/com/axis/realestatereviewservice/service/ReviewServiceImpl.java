package com.axis.realestatereviewservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.realestatereviewservice.entity.Review;
import com.axis.realestatereviewservice.repository.ReviewRepository;

@Service
public class ReviewServiceImpl implements ReviewService {
	
	@Autowired
	ReviewRepository reviewRepository;
	
	@Override
	public List<Review> allReviews() {
		return (List<Review>) reviewRepository.findAll();
	}

	@Override
	public Review findReviewById(long reviewId) {
		return reviewRepository.findById(reviewId).get();
	}

	@Override
	public void addReview(Review review) {
		reviewRepository.save(review);
	}

	@Override
	public void updateReview(long reviewId, Review review) {
		reviewRepository.save(review);
	}

	@Override
	public void deleteReview(long reviewId) {
		reviewRepository.deleteById(reviewId);
	}

}
