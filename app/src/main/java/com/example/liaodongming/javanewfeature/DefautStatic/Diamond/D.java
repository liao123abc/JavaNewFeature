package com.example.liaodongming.javanewfeature.DefautStatic.Diamond;

/**
 * Created by liaodongming on 2016/11/16.
 */

public interface D extends B, C {
    /**
     * 如果不实现该方法会提示：D inherits unrelated defaults for sayHi()
     * from B and C
     */
    @Override
    default void sayHi() {
        System.out.print("D say hi");
    }
}
