package com.frankmoley.lil.fid.config;

import com.frankmoley.lil.fid.service.GreetingService;
import com.frankmoley.lil.fid.service.OutputService;
import com.frankmoley.lil.fid.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties") // path to properties file
public class ApplicationConfig {

    @Value("${app.greeting}") // pulling data from properties file
    private String greeting; 
    @Value("${app.name}")
    private String name;

    @Autowired
    private GreetingService greetingService;
    @Autowired
    private TimeService timeService;

    @Bean
    public TimeService timeService(){
        return new TimeService(true);
    }

    @Bean
    public OutputService outputService(){
        return new OutputService(greetingService, timeService, name); // injecting data into service
    }

    @Bean
    public GreetingService greetingService(){
        return new GreetingService(greeting);
    }
}
