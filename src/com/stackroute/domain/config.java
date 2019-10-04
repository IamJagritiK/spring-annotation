package com.stackroute.domain;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.stackroute.domain")

public class config {
    @Bean
    public Actor getActor()
    {
        Actor actor=new Actor();
        actor.setname("Rohan");
        actor.setage(45);
        actor.setgender("male");

        return actor;

    }
    @Bean
    public Movie getMovie()
    {
        return new Movie();
    }

}
