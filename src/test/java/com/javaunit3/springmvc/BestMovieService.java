package com.javaunit3.springmvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BestMovieService {
//    @Autowired can use setter as autowired or constructor
    private Movie movie;
    @Autowired
    public BestMovieService(@Qualifier("titanicMovie") Movie movie){
        this.movie = movie;
    }
    @Autowired
    public Movie getBestMovie(){
        return movie;
    }
//    @Autowired
//    public void setMovie(Movie movie){
//        this.movie = movie;
//    }

}
