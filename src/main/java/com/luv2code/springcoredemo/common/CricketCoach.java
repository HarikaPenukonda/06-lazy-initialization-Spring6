package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component // This annnotation marks the class as spring bean, makes it available for dependency injection
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15mins !!!";
    }
}
