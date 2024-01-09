package com.learnquest.generics;

public class Maximum {
    public static <T extends Comparable<T>> T maximum(T first, T second, T third) {
        T max = first;

        if (second.compareTo(max) > 0) {
            max = second;
        }

        if (third.compareTo(max) > 0) {
            max = third;
        }

        return max;
    }
}
