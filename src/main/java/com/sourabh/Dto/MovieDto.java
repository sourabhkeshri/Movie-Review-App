package com.sourabh.Dto;

import org.springframework.stereotype.Component;

@Component
public class MovieDto {
	String name;
	long date;
	long rating;
	
	public MovieDto() {
		
	}
	public MovieDto(String name, long date, long rating) {
		super();
		this.name = name;
		this.date = date;
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getDate() {
		return date;
	}
	public void setDate(long date) {
		this.date = date;
	}
	public long getRating() {
		return rating;
	}
	public void setRating(long rating) {
		this.rating = rating;
	}
	

}
