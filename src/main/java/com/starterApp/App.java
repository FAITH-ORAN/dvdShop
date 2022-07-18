package com.starterApp;

import com.controller.MovieController;
import com.repository.FileMovieRepository;
import com.service.DefaultMovieService;

public class App {
	   public static void main( String[] args ) {
	        MovieController movieController=new MovieController();
	        FileMovieRepository movieRepository=new FileMovieRepository();
	        DefaultMovieService movieService=new DefaultMovieService();
	        movieController.setMovieService(movieService);
	        movieService.setMovieRepository(movieRepository);
	        movieController.addUsingConsole();
	    }
	

}
