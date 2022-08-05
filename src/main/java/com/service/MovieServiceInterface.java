package com.service;

import java.util.List;

import com.bean.Movie;

public interface MovieServiceInterface {

	
	void registerMovie(Movie movie);
	List<Movie>getMovieList();
}
