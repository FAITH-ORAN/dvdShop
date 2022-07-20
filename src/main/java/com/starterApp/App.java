package com.starterApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.controller.MovieController;
import com.repository.file.FileMovieRepository;
import com.service.DefaultMovieService;

@SpringBootApplication
//@Configuration
//@ComponentScan(basePackages= {"com.repository.file","com.service","com.controller"})
//@PropertySource("classpath:application.properties")
@ImportResource("clapath:applicationContext.xml")
public class App {
	   public static void main( String[] args ) {
			/*
			 * MovieController movieController=new MovieController(); FileMovieRepository
			 * movieRepository=new FileMovieRepository(); DefaultMovieService
			 * movieService=new DefaultMovieService();
			 * movieController.setMovieService(movieService);
			 * movieService.setMovieRepository(movieRepository);
			 */

			// ApplicationContext context=new
			// ClassPathXmlApplicationContext("applicationContext.xml");
			// ApplicationContext context=new AnnotationConfigApplicationContext(App.class);
			ApplicationContext context = SpringApplication.run(App.class, args);
			MovieController movieController = context.getBean(MovieController.class);
		   
	        movieController.addUsingConsole();
	    }
	

}
