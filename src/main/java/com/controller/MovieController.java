package com.controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bean.Movie;
import com.service.MovieServiceInterface;
@Controller
public class MovieController {
	@Autowired
	private MovieServiceInterface movieService;

    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

    public void addUsingConsole(){
        System.out.println( "What is the movie title?" );
        Scanner scanner=new Scanner(System.in);
        String title=scanner.nextLine();
        System.out.println( "What is the movie genre?" );
        String genre=scanner.nextLine();
        Movie movie=new Movie();
        movie.setTitle(title);
        movie.setGenre(genre);
        movieService.registerMovie(movie);
    }
}
