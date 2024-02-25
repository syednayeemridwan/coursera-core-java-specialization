package com.frankmoley.lil.fid.service;

public class OutputService {

    private final String name;

    private final GreetingService greetingService;
    private final TimeService timeService;

    public OutputService(GreetingService greetingService, TimeService timeService, String name){ // put name parameter  here
        this.greetingService = greetingService;
        this.timeService = timeService;
        this.name = name;
    }

    public void generateOutput(){ // name parameter SHOULD NOT be here
        String output = timeService.getCurrentTime() + " " + greetingService.getGreeting(name);
        System.out.println(output);
    }

}
