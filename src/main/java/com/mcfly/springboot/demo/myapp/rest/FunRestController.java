package com.mcfly.springboot.demo.myapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${hello.message}")
    private String helloMessage;


    /**
     * Exposes the "/" endpoint that returns "Hello world!".
     */
    @GetMapping("/")
    public String sayHello() {
        return helloMessage;
    }

    /**
     * Endpoint to test project auto-reload (spring-boot-devtools).
     */
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Perform a workout!";
    }

    /**
     * Another endpoint to test project auto-reload (spring-boot-devtools).
     */
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day!";
    }
}
