package com.mcfly.myapp._02_springcore.demo.rest;

import com.mcfly.common.Coach;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachScopeController {

    private final Coach trackCoach1;
    private final Coach trackCoach2;
    private final Coach cricketCoach1;
    private final Coach cricketCoach2;
    private final Coach baseballCoach1;
    private final Coach baseballCoach2;

    public CoachScopeController(@Qualifier("trackCoach") Coach trackCoach1,
                                @Qualifier("trackCoach") Coach trackCoach2,
                                @Qualifier("cricketCoach") Coach cricketCoach1,
                                @Qualifier("cricketCoach") Coach cricketCoach2,
                                @Qualifier("baseballCoach") Coach baseballCoach1,
                                @Qualifier("baseballCoach") Coach baseballCoach2) {
        this.trackCoach1 = trackCoach1;
        this.trackCoach2 = trackCoach2;
        this.cricketCoach1 = cricketCoach1;
        this.cricketCoach2 = cricketCoach2;
        this.baseballCoach1 = baseballCoach1;
        this.baseballCoach2 = baseballCoach2;
    }

    /*
        TrackCoach is a singleton by default.
        CricketCoach is a singleton according to the explicit @Scope annotation.
        BaseballCoach is a prototype according to the explicit @Scope annotation.
     */
    @GetMapping("/checkCoachesScope")
    public String checkCoachesScope() {
        return "Track coach is a singleton: " + (trackCoach1 == trackCoach2) + ","
                + "cricketCoach is a singleton: " + (cricketCoach1 == cricketCoach2) + ","
                + "baseballCoach is a prototype: " + (baseballCoach1 != baseballCoach2) + ".";
    }
}
