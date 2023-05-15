package com.mcfly.myapp._02_springcore.demo.rest;

import com.mcfly.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CricketCoachConstructorInjectionController {

    private final Coach coach;

    // A @Qualifier annotation should be used to distinct between different Coach implementations.
    @Autowired
    public CricketCoachConstructorInjectionController(@Qualifier("cricketCoach") Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/cricketWorkout")
    public String getCricketWorkout() {
        return coach.getWorkout();
    }
}
