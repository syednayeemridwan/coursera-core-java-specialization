package com.learnquest.boxinfo;

public class ExercisePrint {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3, "My Rectangle", "Red");
        // Shape shape[] =
        Shape square = new Square(2, "My Square", "Yellow");
        Shape cube = new Cube(3, "My Cube", "Green");
        Shape box = new Box(2, 3, 1, "My Box", "Black");
        Shape circle = new Circle(3, "My Circle", "Orange");
        Shape shapes[] = { rectangle, square, cube, box, circle };
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
