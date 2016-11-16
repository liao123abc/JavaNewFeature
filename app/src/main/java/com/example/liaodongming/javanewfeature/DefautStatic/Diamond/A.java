package com.example.liaodongming.javanewfeature.DefautStatic.Diamond;

/**
 * Created by liaodongming on 2016/11/16.
 */

public interface A {
    default void sayHi() {
        System.out.print("A say hi");
    }
}
