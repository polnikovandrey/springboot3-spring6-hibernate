package com.mcfly.myapp._02_springcore.demo.rest;

import com.mcfly.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwimCoachConfigurationController {

    private final Coach swim100Coach;
    private final Coach swim500Coach;

    @Autowired
    public SwimCoachConfigurationController(@Qualifier("swim100") Coach swim100Coach, @Qualifier("swim500") Coach swim500Coach) {
        this.swim100Coach = swim100Coach;
        this.swim500Coach = swim500Coach;
    }

    @GetMapping("/swim100")
    public String getSwim100Workout() {
        return swim100Coach.getWorkout();
    }

    @GetMapping("/swim500")
    public String getSwim500Workout() {
        return swim500Coach.getWorkout();
    }
}
