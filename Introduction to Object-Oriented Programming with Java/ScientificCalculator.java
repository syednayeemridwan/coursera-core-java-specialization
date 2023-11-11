// package com.javaoo.calculators;

public class ScientificCalculator {
    public final static double PI = 3.14;
    private double holdValue;

    public ScientificCalculator(double x) {
        holdValue = x;
    }

    public static double exp(double x) {
        return 0;
    }

    public static double log(double x) {
        return 0;
    }

    public void putValueInMemory(double x) {
        holdValue = x;
    }

    public double getValueFromMemory() {
        return holdValue;
    }

    // public static void main(String[] args) {

    // }

}
