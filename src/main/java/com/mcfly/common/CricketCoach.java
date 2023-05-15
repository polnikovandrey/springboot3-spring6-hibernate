package com.mcfly.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public final class CricketCoach implements Coach {

    @Override
    public String getWorkout() {
        return "Practice fast bowling for 15 minutes.";
    }
}
