package org.amaanil;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Visitors visitors(){
        return new Visitors("name", "timestamp", "doctorName");
    }



}
