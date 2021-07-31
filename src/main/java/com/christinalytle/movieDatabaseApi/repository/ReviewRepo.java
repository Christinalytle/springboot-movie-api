package com.christinalytle.movieDatabaseApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.christinalytle.movieDatabaseApi.entity.Review;

public interface ReviewRepo extends JpaRepository <Review, Long> {

}
