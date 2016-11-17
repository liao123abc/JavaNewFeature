package com.example.liaodongming.javanewfeature.DefautStatic.Static;

/**
 * Created by liaodongming on 2016/11/16.
 */

public class B implements A {

    public void sayHi() {
        System.out.println("B: hello!");
    }

    public static void test(){
        /**
         * Java interface static method is visible to interface methods only,
         */
        B obj = new B();
        obj.greet();
        obj.sayHi();

        /**
         * 可以直接调用
         */
        A.sayHi();
    }
}