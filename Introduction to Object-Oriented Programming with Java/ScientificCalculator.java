// package com.javaoo.calculators;

public class ScientificCalculator {
    public final static double PI = 3.14;
    private double holdValue;

    public ScientificCalculator() {
    }

    public ScientificCalculator(double x) {
        holdValue = x;
    }

    public double exp(double x) {
        return Math.exp(x);
    }

    public double log(double x) {
        return Math.log(x);
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
