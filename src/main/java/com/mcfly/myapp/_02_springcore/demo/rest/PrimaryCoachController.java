package com.mcfly.myapp._02_springcore.demo.rest;

import com.mcfly.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimaryCoachController {

    private final Coach coach;

    // TrackCoach is used as a coach: it has a @Primary annotation (e.g. is a default implementation to be used).
    @Autowired
    public PrimaryCoachController(Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/workout")
    public String getWorkout() {
        return coach.getWorkout();
    }
}
