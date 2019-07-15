package com.stackroute.annotations;

import com.stackroute.annotations.Actor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {
    @Bean
    public Actor Shahrukh()
    {
        Actor actor=new Actor();
        actor.setAge(40);
        actor.setGender("male");
        actor.setName("Shahrukh Khan");
        return actor;

    }
    @Bean(name={"Arya","DJ"})
    public Movie movieBean()//bean name is movieBean
    {
        Movie movie=new Movie(Shahrukh());
        return movie;

    }
}