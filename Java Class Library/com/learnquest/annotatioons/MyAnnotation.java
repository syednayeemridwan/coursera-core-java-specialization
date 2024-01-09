package com.learnquest.annotatioons;

import java.lang.annotation.ElementType;

import javax.swing.text.html.parser.Element;

@Documented
@Target({ ElementType.TYPE, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    int id();

    String name();
}
