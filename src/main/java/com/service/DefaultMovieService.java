package com.service;

import com.bean.Movie;
import com.repository.MovieRepositoryInterface;



public class DefaultMovieService implements MovieServiceInterface{

    private MovieRepositoryInterface movieRepository;

    public MovieRepositoryInterface getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository(MovieRepositoryInterface movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void registerMovie(Movie movie){

        movieRepository.add(movie);
    }
}