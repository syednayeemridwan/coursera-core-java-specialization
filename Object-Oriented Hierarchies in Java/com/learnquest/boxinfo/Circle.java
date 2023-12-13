package com.learnquest.boxinfo;

public class Circle extends Shape implements TwoD {
    private double radius;
    private final double PI = 3.1416;

    public Circle() {
        super();
    }

    public Circle(double radius) {
        super();
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * getRadius() * getRadius();
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * getRadius();
    }

}
