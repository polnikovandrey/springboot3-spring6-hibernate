package com.mcfly.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennisCoach implements Coach {

    @Override
    public String getWorkout() {
        return "Practice your backhand volley";
    }
}
