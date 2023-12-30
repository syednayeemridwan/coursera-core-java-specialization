
package com.learnquest.generics;

public class GenericBoxExerciser {
    public static void main(String[] args) {
        GenericBox<String> stringBox = new GenericBox<>(); // Fixed the type of stringBox
        GenericBox<Integer> intBox = new GenericBox<>(); // Fixed the type of intBox

        stringBox.setT("Hello World");
        intBox.setT(10);

        System.out.printf("Getting from: %s value = %s%n", stringBox.getClass().getName(), stringBox.getT());
        System.out.printf("Getting from: %s value = %d%n", intBox.getClass().getName(), intBox.getT());

    }
}
