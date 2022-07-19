package com.starterApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.controller.MovieController;
import com.repository.file.FileMovieRepository;
import com.service.DefaultMovieService;

public class App {
	   public static void main( String[] args ) {
	        /*MovieController movieController=new MovieController();
	        FileMovieRepository movieRepository=new FileMovieRepository();
	        DefaultMovieService movieService=new DefaultMovieService();
	        movieController.setMovieService(movieService);
	        movieService.setMovieRepository(movieRepository);*/
		   	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
			MovieController movieController=context.getBean(MovieController.class);
		   
		   
	        movieController.addUsingConsole();
	    }
	

}
