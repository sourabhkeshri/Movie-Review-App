package com.sourabh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sourabh.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer>{
	
	public Movie findByName(String name);

}
