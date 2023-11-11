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

    // Default values for box in case any invalid number is given
    private double height = 1;
    private double width = 1;
    private double length = 1;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Height must be greater than 0");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Width must be greater than 0");
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Length must be greater than 0");
        }
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

    // public static void main(String[] args) {
    // Box b = new Box(1.2);
    // b.printBox();
    // }
}