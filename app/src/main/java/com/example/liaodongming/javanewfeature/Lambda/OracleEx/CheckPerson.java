package com.example.liaodongming.javanewfeature.Lambda.OracleEx;

/**
 * Created by liaodongming on 2016/10/10.
 *
 * The CheckPerson interface is a functional interface. A functional interface is any
 * interface that contains only one abstract method. (A functional interface may contain
 * one or more default methods or static methods.) Because a functional interface contains
 * only one abstract method, you can omit the name of that method when you implement it.
 *
 *
 */

public interface CheckPerson {
    boolean test(Person p);
}
