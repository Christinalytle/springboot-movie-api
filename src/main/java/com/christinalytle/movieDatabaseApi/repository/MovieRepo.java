package com.christinalytle.movieDatabaseApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.christinalytle.movieDatabaseApi.entity.Movie; 

public interface MovieRepo extends JpaRepository <Movie, Long> {

}
