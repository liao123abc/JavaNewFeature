package com.example.liaodongming.javanewfeature.Annotation.simple;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by liaodongming on 2016/9/4.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MySampleAnnotation {
    public String name();
    public int age();
}
