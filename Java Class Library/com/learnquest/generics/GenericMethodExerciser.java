package com.learnquest.generics;

public class GenericMethodExerciser {
    public static void main(String[] args) {
        Integer intArray[] = { 1, 2, 3, 4 };
        Double doubleArray[] = { 1.1, 2.2, 3.3, 4.4 };
        Character charArray[] = { 'a', 'b', 'c', 'd' };

        // No need for type argument when creating an instance of GenericMethod
        System.out.println("Integer array contains:");
        GenericMethod.printArray(intArray);
        System.out.println("Double array contains:");
        GenericMethod.printArray(doubleArray);
        System.out.println("Character array contains:");
        GenericMethod.printArray(charArray);
    }
}
