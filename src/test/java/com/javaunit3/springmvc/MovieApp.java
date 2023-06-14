package com.javaunit3.springmvc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//scan spring components
@ComponentScan
public class MovieApp {
    public static void main(String[] args) {
        //get application context, use default bean id ( clas name of bean string with lowercase)
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MovieApp.class);
        //field injection to inject Movie into BestMovieService
        BestMovieService bestMovieService = applicationContext.getBean("bestMovieService", BestMovieService.class);
        Movie bestMovie = bestMovieService.getBestMovie();

        System.out.println("Title: " + bestMovie.getTitle());
        System.out.println("Maturity Rating: "+bestMovie.maturityRating());
        System.out.println("Genre: "+bestMovie.getGenre());
    }
}
