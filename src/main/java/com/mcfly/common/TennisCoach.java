package com.mcfly.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Override
    public String getWorkout() {
        return "Practice your backhand volley";
    }
}
