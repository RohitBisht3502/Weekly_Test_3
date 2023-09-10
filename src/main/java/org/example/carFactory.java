package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class carFactory {
    @Bean
    public Car getCar1(){ return new Car("car color is orange");}
}
