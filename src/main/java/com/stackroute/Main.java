package com.stackroute;

import com.stackroute.annotations.Actor;
import com.stackroute.annotations.ConfigClass;
import com.stackroute.annotations.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.register(ConfigClass.class);
        context.refresh();
        Movie movie=context.getBean("movieB", Movie.class);
        Movie movie1=context.getBean("movieA", Movie.class);
        movie.act();
        movie1.act();
        //Actor actor=context.getBean("actor", Actor.class);
        System.out.println(movie1==movie);
    }
}