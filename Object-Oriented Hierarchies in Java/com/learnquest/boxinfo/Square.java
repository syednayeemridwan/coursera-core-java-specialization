package com.learnquest.boxinfo;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String name, String color) {
        super(side, side, name, color);
    }
}
