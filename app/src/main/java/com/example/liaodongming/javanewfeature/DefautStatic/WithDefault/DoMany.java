package com.example.liaodongming.javanewfeature.DefautStatic.WithDefault;

/**
 * Created by Administrator on 2016/10/7.
 */

public interface DoMany {

    default public void methodA1() {

    }

    default public void methodA2() {

    }

    default public void methodB1() {

    }

    default public void methodB2() {

    }

    /**
     *
     * A default method cannot override a method from java.lang.Object.
     *
     * Object的方法本来就是所有类都应该有的方法，根本不需要default
     *
     */
//    default void toString() {
//
//    }

}
