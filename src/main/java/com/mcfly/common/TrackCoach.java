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
@Lazy   /* Prototype scope implies laziness, there is no need of @Lazy annotation. */
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TrackCoach implements Coach {

    private String workoutMessage;

    @Override
    public String getWorkout() {
        return workoutMessage;
    }

    @PostConstruct
    public void postConstruct() {       // TODO !!!
        this.workoutMessage = "Run a hard 5k";
    }

    /* Prototype beans are not being destroyed by Spring, user is responsible for cleaning. */
    @PreDestroy
    public void preDestroy() {      // TODO !!!
        this.workoutMessage = "Empty workout message";
    }
}
