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
        Object ob;
        // System.out.println("Hello");
        AbstractApplicationContext context=new AnnotationConfigApplicationContext(ConfigClass.class);
        context.getBean("Arya", Movie.class).act();

    }
}