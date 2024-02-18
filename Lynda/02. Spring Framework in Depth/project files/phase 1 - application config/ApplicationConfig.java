package com.frankmoley.lil.fid.config;

import com.frankmoley.lil.fid.service.GreetingService;
import com.frankmoley.lil.fid.service.OutputService;
import com.frankmoley.lil.fid.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Autowired
    private GreetingService greetingService;
    @Autowired
    private TimeService timeService;

    @Bean
    public TimeService timeService(){
        return new TimeService(true);
    }
    
    @Bean
    public GreetingService greetingService(){
        return new GreetingService("Hello");
    }

    @Bean
    public OutputService outputService(){
        return new OutputService(greetingService, timeService); // these parameters should be autowired
    }

    
}
