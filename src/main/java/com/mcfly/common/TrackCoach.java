package com.mcfly.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

    @Override
    public String getWorkout() {
        return "Run a hard 5k";
    }
}
