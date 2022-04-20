package com.sourabh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sourabh.Dto.MovieDto;
import com.sourabh.model.Movie;
import com.sourabh.service.MovieService;

@RestController
public class MovieController {
	
	@Autowired
	MovieService service;
	
	@PostMapping("/insert")
	public String insertMovie(@RequestBody MovieDto movie) {
		
		String responce = service.insertMovie(movie);
		return responce;
	}
	
	@GetMapping("/movies")
	public List<Movie> getMovies(){
		return service.getMovies();
	}
	
	@GetMapping("/movieByName/{name}")
	public Movie getMovieByName(@PathVariable String name) {
		return service.getMovieByName(name);
		
	}
	
	

}
