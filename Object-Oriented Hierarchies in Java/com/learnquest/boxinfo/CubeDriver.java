package com.learnquest.boxinfo;

// import com.learnquest.boxinfo.Cube;

public class CubeDriver {
    public static void main(String[] args) {
        Cube cube1 = new Cube(5);
        Cube cube2 = new Cube(8);
        System.out.println("Printing cube 1 information : ");
        cube1.printBox();

        System.out.println("Printing cube 2 information : ");
        cube2.printBox();

        System.out.println("Setting cube 1 side to 20 : ");
        cube1.setSide(20);
        cube1.printBox();

        System.out.println("Setting cube 1 side to 40 : ");
        cube1.setSide(40);
        cube1.printBox();

        System.out.println("Setting cube 2 width to -5 : ");
        cube2.setWidth(-5);
        cube2.printBox();

    }
}
