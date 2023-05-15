package com.mcfly.common;

import org.springframework.stereotype.Component;

@Component
public final class CricketCoach implements Coach {

    @Override
    public String getWorkout() {
        return "Practice fast bowling for 15 minutes.";
    }
}
