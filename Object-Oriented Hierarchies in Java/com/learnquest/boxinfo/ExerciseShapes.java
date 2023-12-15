package com.learnquest.boxinfo;

public class ExerciseShapes {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(2, 3);
        Rectangle rec2 = new Rectangle(2, 3, "Another Rectanglgle", "Red");
        Square sq1 = new Square(2);
        Square sq2 = new Square(3);
        Cube cube1 = new Cube(3);
        Cube cube2 = new Cube(4);
        Box b1 = new Box(1, 2, 3);
        Box b2 = new Box(2, 3, 4);

        Shape s[] = { rec1, rec2, sq1, sq2, cube1, cube2, b1, b2 };
        // Shape s[] = new Shape[8];
        // s[0] = rec1;
        for (Shape shape : s) {
            shape.setColor("Black");
        }
        // for (Shape shape : s) {
        // shape.getVolume(); // Will not work
        // }

        // for (Shape shape : s) {
        // ThreeD tempShape = (ThreeD) shape;
        // System.out.println(tempShape.getVolume());
        // }
        Circle c1 = new Circle(2);
        TwoD twods[] = { c1, rec1, sq1 };

        for (TwoD twoD : twods) {
            System.out.println(twoD.getArea());
            System.out.println(twoD.getPerimeter());
        }

    }
}
