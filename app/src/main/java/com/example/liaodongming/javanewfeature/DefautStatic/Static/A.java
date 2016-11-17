package com.example.liaodongming.javanewfeature.DefautStatic.Static;

/**
 * Created by liaodongming on 2016/11/16.
 */
public interface A {

    default void greet() {
            sayHi();
    }

    static void sayHi() {
        System.out.println("A: hello!");
    }
}