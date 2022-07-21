package com.repository.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.bean.Movie;
import com.repository.MovieRepositoryInterface;
@Repository
public class FileMovieRepository implements MovieRepositoryInterface{
	  @Value("${movies.file.location}")
	private File file;

    public void add(Movie movie){
        FileWriter writer;
        try{
            writer=new FileWriter(file,true);
             System.out.println(file);
            writer.write(movie.getTitle()+";"+movie.getGenre()+"\n");
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("The movie "+movie.getTitle()+" has been added.");
    }
	
	 public File getFile() {
			return file;
		}
		public void setFile(File file) {
			this.file = file;
		}

}
