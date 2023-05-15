package com.mcfly.myapp._02_springcore.demo.rest;

import com.mcfly.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoSetterInjectionController {

    private Coach coach;

    @GetMapping("/dailyworkout1")
    public String getDailyWorkout1() {
        return coach.getDailyWorkout();
    }

    @Autowired
    public void setSuperCoach(Coach coach) {        // Note the method name, it doesn't influence autowiring.
        this.coach = coach;
    }
}
