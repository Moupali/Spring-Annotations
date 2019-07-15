package com.stackroute.annotations;

import com.stackroute.annotations.Actor;
import com.stackroute.annotations.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigClass{
//    @Bean
//    public Actor actor()
//    {
//        Actor actor=new Actor();
//        actor.setAge(40);
//        actor.setGender("Male");
//        actor.setName("Shahrukh Khan");
//        return actor;
//    }
    @Bean
    public Actor actorAlia()
    {
        Actor actor=new Actor("Alia Bhatt","Female",22);
        return actor;
    }
    @Bean
    public Actor actorShahid()
    {
        Actor actor=new Actor("Shahid Kapoor","Male",32);
        return actor;
    }
    @Bean
    public Actor actorDeepika()
    {
        Actor actor=new Actor("Deepika","Female",29);
        return actor;
    }
    @Bean({"movieA","movieB"})
    @Scope("prototype")
    public Movie movie()
    {
        Movie movie =new Movie(actorAlia());
        return movie;
    }
}