package com.mcfly.common;

public class SwimCoach implements Coach {

    private final int meters;

    public SwimCoach(int meters) {
        this.meters = meters;
    }

    @Override
    public String getWorkout() {
        return "Swim " + meters + " meters.";
    }
}
