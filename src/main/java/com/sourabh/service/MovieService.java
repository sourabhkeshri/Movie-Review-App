package com.sourabh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sourabh.Dto.MovieDto;
import com.sourabh.model.Movie;
import com.sourabh.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	MovieRepository repo;
	public String insertMovie(MovieDto movie) {
		Movie movieObj = new Movie(movie.getName(), movie.getDate(), movie.getRating()); 
		 repo.save(movieObj);
		return movie.getName()+" inserted";
		
	}
	public List<Movie> getMovies() {
		return repo.findAll();
	}
	public Movie getMovieByID(int id) {
		return repo.getById(id);
	}
	public Movie getMovieByName(String name) {
		return repo.findByName(name);
	}

}
