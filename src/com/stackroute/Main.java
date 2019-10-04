package com.stackroute;


import com.stackroute.domain.config;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
        Movie movie=context.getBean(Movie.class);
        Movie movie1=context.getBean(Movie.class);
        if(movie==movie1)
        {
            System.out.println("true");
        }
        else
            System.out.println("false");
        movie.print();


       // System.out.println( "Hello World!" );
    }
}