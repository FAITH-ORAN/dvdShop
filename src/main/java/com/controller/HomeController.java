package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Movie;
import com.service.MovieServiceInterface;




@Controller
public class HomeController {
	@Autowired
	private MovieServiceInterface movieService;

    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

	@RequestMapping("/dvdstore-home")
	public @ModelAttribute("movies")  List<Movie> displayHome() {
		System.out.println("Tentative d'affichage de l'a-propos");
		List<Movie>movies=movieService.getMovieList();
		
		return movies;
	}
}
