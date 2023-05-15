package com.mcfly.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
    There is no need to specify an implementation to be used by DI if there is a single implementation.
    In case there are multiple implementation - the @Qualifier annotation should be used along with @Autowired.
    Otherwise the @Primary @Component is used as a default implementation.
 */
@Component
@Primary
@Lazy
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TrackCoach implements Coach {

    private String workoutMessage;

    @Override
    public String getWorkout() {
        return workoutMessage;
    }

    @PostConstruct
    public void postConstruct() {
        this.workoutMessage = "Run a hard 5k";
    }

    @PreDestroy
    public void preDestroy() {
        this.workoutMessage = "Empty workout message";
    }
}
