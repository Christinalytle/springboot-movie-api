package com.christinalytle.movieDatabaseApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.christinalytle.movieDatabaseApi.entity.Auditorium;

public interface AuditoriumRepo extends JpaRepository <Auditorium, Long> {

}
