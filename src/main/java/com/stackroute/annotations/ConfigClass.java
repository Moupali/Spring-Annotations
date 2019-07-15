package com.stackroute.annotations;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:/value.properties")
public class ConfigClass {
    @Bean
    public BeanLifecycleDemo beanLifecycleDemo(){
        return new BeanLifecycleDemo();
    }
    @Bean(name = {"Alia","Prabhas"})
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Actor Alia()//Alia is the name of ID or object
    {
        return new Actor();
//        return actor;

    }
    @Bean(name={"DJ","Arya"})
    public Movie movieBean()//bean name is movieBean
    {
        Movie movie=new Movie();
        //movie.setActor(Alia());
        return movie;

    }
}
