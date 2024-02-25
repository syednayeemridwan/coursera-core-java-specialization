package com.frankmoley.lil.fid.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // annotation should work on methods
@Retention(RetentionPolicy.RUNTIME) // annotation should be loaded during runtime
public @interface Loggable {
}
