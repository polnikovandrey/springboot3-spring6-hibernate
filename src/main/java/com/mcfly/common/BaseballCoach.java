package com.mcfly.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    @Override
    public String getWorkout() {
        return "Spend 30 minutes in batting practice";
    }
}
