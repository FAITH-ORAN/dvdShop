package com.repository.memory;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bean.Movie;
import com.repository.MovieRepositoryInterface;
@Repository
public class MemoryMovieRepository implements MovieRepositoryInterface{

    private List<Movie> movies=new ArrayList<>();

    public void add(Movie movie){
        movies.add(movie);
        System.out.println("The movie "+movie.getTitle()+" has been added.");
    }

}