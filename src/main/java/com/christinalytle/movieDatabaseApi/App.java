package com.christinalytle.movieDatabaseApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.christinalytle.movieDatabaseApi")
@SpringBootApplication 
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args); 
    }
}
