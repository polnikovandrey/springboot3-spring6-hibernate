package com.mcfly.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BaseballCoach implements Coach {

    @Override
    public String getWorkout() {
        return "Spend 30 minutes in batting practice";
    }
}
