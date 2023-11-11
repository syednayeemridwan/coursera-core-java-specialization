// package com.lq.exercises;

public class Box {
    public Box(double height, double width, double length) {
        setHeight(height);
        setWidth(width);
        setLength(length);
    }

    public Box(double height) {
        this(height, height, height);
    }

    private double height;
    private double width;
    private double length;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getVolume() {
        return height * width * length;
    }

    public double getSurfaceArea() {
        return (length * height + height * width + width * length) * 2;
    }

    public void printBox() {
        if (length <= 0 || width <= 0 || width <= 0) {
            System.out.println("Invalid entry");
        } else {
            System.out.println("Length = " + length);
            System.out.println("Width = " + width);
            System.out.println("Height = " + height);
            System.out.println("Volume = " + getVolume());
            System.out.println("Surface Area = " + getSurfaceArea());
        }

    }

    public static void main(String[] args) {
        Box b = new Box(1.2);
        b.printBox();
    }
}