package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

//@ComponentScan("com.stackroute.domain")

public class config {

    @Bean
    @Scope("prototype")
    public Movie getmovie()
    {
        return new Movie();
    }
    @Bean
    public Actor getActor()
    {
        return new Actor("rob","male",38);
    }
  

}
