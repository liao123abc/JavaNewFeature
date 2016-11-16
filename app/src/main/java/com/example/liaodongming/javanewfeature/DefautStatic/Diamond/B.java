package com.example.liaodongming.javanewfeature.DefautStatic.Diamond;

/**
 * Created by liaodongming on 2016/11/16.
 */

public interface B extends A{
    @Override
    default void sayHi() {
        System.out.print("B say hi");
    }
}
