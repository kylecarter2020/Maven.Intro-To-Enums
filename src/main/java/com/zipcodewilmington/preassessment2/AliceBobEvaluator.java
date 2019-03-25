package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator {
    private String input;

    public AliceBobEvaluator(String input) {
        this.input = input;
    }

    public boolean isAlice() {
        return input.equalsIgnoreCase("alice");
    }

    public boolean isBob() {
        return input.equalsIgnoreCase("bob");
    }
}
