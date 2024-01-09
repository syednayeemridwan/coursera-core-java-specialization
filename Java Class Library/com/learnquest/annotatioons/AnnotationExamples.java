package com.learnquest.annotatioons;

import java.util.ArrayList;

// @SuppressWarnings("all")
// @SuppressWarnings("unused")
@SuppressWarnings("rawtypes")
public class AnnotationExamples {
    ArrayList arrayList = new ArrayList();
    int k = 0;

    @SuppressWarnings({ "unused", "unchecked" }) // method level annotation
    public void myMethod1() {
        arrayList.add(new String());
        int i = 0;
        int j = 0;
    }

    public String toString() {
        @SuppressWarnings("unused") // variable level annotation
        int i = 0;
        return super.toString();
    }
}
