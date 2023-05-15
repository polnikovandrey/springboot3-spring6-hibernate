package com.mcfly.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*
    There is no need to specify an implementation to be used by DI if there is a single implementation.
    In case there are multiple implementation - the @Qualifier annotation should be used along with @Autowired.
    Otherwise the @Primary @Component is used as a default implementation.
 */
@Component
@Primary
@Lazy
public class TrackCoach implements Coach {

    @Override
    public String getWorkout() {
        return "Run a hard 5k";
    }
}
