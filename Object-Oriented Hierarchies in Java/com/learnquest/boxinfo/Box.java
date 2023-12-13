package com.learnquest.boxinfo;

public class Box extends Shape implements ThreeD {

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private double length;
    private double height;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

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

    public double getVolume() {
        // Volume = height * width * length
        return getHeight() * getWidth() * getLength();
    }

    public double getSurfaceArea() {
        // Surface Area = 2 * (length * width + length * height + width * height)
        return 2 * (getLength() * getWidth() + getLength() * getHeight()
                + getWidth() * getHeight());
    }

    public void printBox() {
        System.out.println("Length = " + getLength());
        System.out.println("Width = " + getWidth());
        System.out.println("Height = " + getHeight());
        System.out.println("Volume = " + getVolume());
        System.out.println("Surface Area = " + getSurfaceArea());
        System.out.println("------------------------------------");

    }
}
