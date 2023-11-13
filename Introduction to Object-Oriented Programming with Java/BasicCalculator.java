// package com.javaoo.calculators;

public class BasicCalculator {
    public BasicCalculator() {
    }

    public BasicCalculator(double x, double y) {
        // this();
        setX(x);
        setY(y);
    }

    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static final double add(double x, double y) {
        return x + y;
    }

    public static final double subtract(double x, double y) {
        return x - y;
    }

    public static final double multiply(double x, double y) {
        return x * y;

    }

    public static final double divide(double x, double y) {
        return x / y;

    }

    // public static void main(String[] args) {

    // }
}
