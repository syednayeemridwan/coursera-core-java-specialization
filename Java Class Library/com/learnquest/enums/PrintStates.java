package com.learnquest.enums;

public class PrintStates {
    public static void main(String[] args) {
        for (States state : States.values()) {
            System.out.println("Country " + state + " has city " + state.getName());
        }
    }
}
