package com.christinalytle.movieDatabaseApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.christinalytle.movieDatabaseApi.entity.Screening;

public interface ScreeningRepo extends JpaRepository <Screening, Long> {

}
