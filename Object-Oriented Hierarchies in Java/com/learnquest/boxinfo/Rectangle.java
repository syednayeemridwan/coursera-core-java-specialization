package com.learnquest.boxinfo;

public class Rectangle extends Shape implements TwoD {
    private double length;
    private double width;

    public Rectangle() {
        super();
    }

    public Rectangle(double length, double width) {
        super();
        setLength(length);
        setWidth(width);
        super.setName("Unknown");
        super.setColor("White");
    }

    public Rectangle(double length, double width, String name, String color) {
        super();
        setLength(length);
        setWidth(width);
        super.setName(name);
        super.setColor(color);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return 111;
    }

    @Override
    public double getPerimeter() {
        return 222;
    }

}
