package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {
    ALICE,
    BOB;

    public String getCatchPhrase() {
        if(isAlice()){
            return "Hey, my name is ALICE!";
        }
        else {
            return "Hey, my name is BOB!";
        }
    }

    public boolean isBob() {
        return this == BOB;
    }

    public boolean isAlice() {
        return this == ALICE;
    }
}
