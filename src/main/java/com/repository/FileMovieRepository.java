package com.repository;

import java.io.FileWriter;
import java.io.IOException;

import com.bean.Movie;

public class FileMovieRepository implements MovieRepositoryInterface{

    public void add(Movie movie){
        FileWriter writer;
        try{
            writer=new FileWriter("C:\\temp\\movies.txt",true);
            writer.write(movie.getTitle()+";"+movie.getGenre()+"\n");
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("The movie "+movie.getTitle()+" has been added.");
    }

}
