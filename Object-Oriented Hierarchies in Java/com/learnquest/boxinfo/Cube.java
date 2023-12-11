package com.learnquest.boxinfo;

public class Cube extends Box {
    public Cube(double side) {
        super(side, side, side);
    }

    double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            System.out.println("Must be > 0");

        } else {
            super.setHeight(side);
            super.setLength(side);
            super.setWidth(side);
        }
    }

    @Override
    public void setHeight(double height) {
        this.setSide(height);
    }

    @Override
    public void setLength(double length) {
        this.setSide(length);
    }

    @Override
    public void setWidth(double width) {
        this.setSide(width);
    }

    @Override
    public double getSurfaceArea() {
        return super.getSurfaceArea();
    }

    @Override
    public double getVolume() {
        return super.getVolume();
    }

    @Override
    public void printBox() {
        super.printBox();
    }

}
