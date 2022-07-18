package com.repository;

import java.util.ArrayList;
import java.util.List;

import com.bean.Movie;

public class MemoryMovieRepository implements MovieRepositoryInterface{

    private List<Movie> movies=new ArrayList<>();

    public void add(Movie movie){
        movies.add(movie);
        System.out.println("The movie "+movie.getTitle()+" has been added.");
    }

}