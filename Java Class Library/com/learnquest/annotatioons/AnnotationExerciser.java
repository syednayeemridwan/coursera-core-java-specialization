package com.learnquest.annotatioons;

import java.lang.annotation.Annotation;

public class AnnotationExerciser {
    public static void main(String[] args) {
        Class classes[] = { UseAnnotation.class };
        for (Class classOb : classes) {
            Annotation annotations[] = classOb.getAnnotations();
            for (Annotation annotation : annotations) {
                MyAnnotation a = (MyAnnotation) annotation;
                String name = a.name();
                int id = a.id();
                System.out.println("Id = " + id + " and name = " + name);
            }
        }
    }
}
