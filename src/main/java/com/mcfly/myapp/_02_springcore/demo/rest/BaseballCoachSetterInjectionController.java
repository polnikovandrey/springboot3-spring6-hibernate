package com.mcfly.myapp._02_springcore.demo.rest;

import com.mcfly.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseballCoachSetterInjectionController {

    private Coach coach;

    @GetMapping("/baseballWorkout")
    public String getBaseballWorkout1() {
        return coach.getWorkout();
    }

    // A @Qualifier annotation should be used to distinct between different Coach implementations.
    @Autowired
    public void setSuperCoach(@Qualifier("baseballCoach") Coach coach) {        // Note the method name, it doesn't influence autowiring.
        this.coach = coach;
    }
}
