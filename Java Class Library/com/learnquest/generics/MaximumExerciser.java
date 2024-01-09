package com.learnquest.generics;

public class MaximumExerciser {
    public static void main(String[] args) {
        System.out.printf("Maximum of %d %d %d is %d", 1, 2, 3, Maximum.maximum(1, 2, 3));
        System.out.println();
        System.out.printf("Maximum of %.1f %.1f %.1f is %.1f", .5, .6, .7, Maximum.maximum(.5, .6, .7));
        System.out.println();
        System.out.printf("Maximum of %s %s %s is %s", "apple", "banana", "orange",
                Maximum.maximum("apple", "banana", "orange"));

    }
}
