// package com.javaoo.calculators;

public class TrigonometricCalculator {
    private double someValue;

    public TrigonometricCalculator() {
    }

    public double getSomeValue() {
        return someValue;
    }

    public void setSomeValue(double someValue) {
        this.someValue = someValue;
    }

    public TrigonometricCalculator(double someValue) {
        this.someValue = someValue;
    }

    public double sine(double x) {
        return Math.sin(x);
    }

    public double cosine(double x) {
        return Math.cos(x);
    }

    public double tangent(double x) {
        return Math.tan(x);
    }

    public double arcsine(double x) {
        return Math.asin(x);
    }

    public double arccosine(double x) {
        return Math.acos(x);
    }

    public double arctangent(double x) {
        return Math.atan(x);
    }

    // public static void main(String[] args) {

    // }

}
