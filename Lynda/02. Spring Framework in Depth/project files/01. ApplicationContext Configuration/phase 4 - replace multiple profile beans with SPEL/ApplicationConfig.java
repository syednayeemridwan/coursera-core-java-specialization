package com.frankmoley.lil.fid.config;

import com.frankmoley.lil.fid.service.GreetingService;
import com.frankmoley.lil.fid.service.OutputService;
import com.frankmoley.lil.fid.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationConfig {

    @Value("${app.greeting}")
    private String greeting;
    @Value("${app.name}")
    private String name;
    // Setting up the is24 SPEL variable to replace different profile beans
    @Value("#{new Boolean(environment['spring.profiles.active']!='dev')}")
    private boolean is24;

    @Autowired
    private GreetingService greetingService;
    @Autowired
    private TimeService timeService;
    
    
    // One Bean to replace multiple beans of different profiles with SPEL variable is24 
    @Bean
    public TimeService timeService(){
        return new TimeService(is24);
    }
//    @Bean
//    @Profile("!dev")
//    public TimeService timeService(){
//        return new TimeService(true);
//    }
//
//    @Bean
//    @Profile("dev") // another bean configuration for different profile
//    public TimeService timeService12(){
//        return new TimeService(false);
//    }

    @Bean
    public GreetingService greetingService(){
        return new GreetingService(greeting);
    }
    @Bean
    public OutputService outputService(){
        return new OutputService(greetingService, timeService, name);
    }
}
