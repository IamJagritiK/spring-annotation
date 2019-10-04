package com.stackroute;


import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.config;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
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
      //  BeanLifecycleDemoBean lc=context.getBean(BeanLifecycleDemoBean.class);

        Movie movie=context.getBean(Movie.class);
        // movie.print();

       // ((ConfigurableApplicationContext)context).close();

       // System.out.println( "Hello World!" );
    }
}