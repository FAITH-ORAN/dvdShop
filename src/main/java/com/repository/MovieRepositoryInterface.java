package com.repository;

import java.util.List;

import com.bean.Movie;

public interface MovieRepositoryInterface {
	
	void add(Movie movie);
	List<Movie> list();

}
