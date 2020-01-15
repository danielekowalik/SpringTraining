package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class GreeterConfiguration {

    //shall we change it? Is the constructor injection better?
    @Autowired
    private DatabaseConfiguration databaseConfig;

    @Bean
    @Scope(value = "prototype") //what are the scopes and what is the difference?
    public Greeter greeter() {
        return new Greeter();
    }

    @Bean
    public FriendlyGreeter friendlyGreeter() {
        return new FriendlyGreeter(databaseConfig);
    }
}
