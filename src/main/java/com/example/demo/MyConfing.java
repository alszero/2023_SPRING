package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfing {
    @Bean
    public MyBean helloMyBean(){
        return new MyBean();
    }
    @Bean
    public Person helloMyPerson(){
        Person p = new Person("min", 20);
        p.setSomething("something");
        return p;
    }

}
