package com.example.liaodongming.javanewfeature.Lambda.Closures;

import java.util.function.Function;

/**
 * Created by Administrator on 2016/10/23.
 * http://bruceeckel.github.io/2015/10/17/are-java-8-lambdas-closures/
 */

public class AreLambdasClosures {

    /**
     *  the type of the input to the function
     *  the type of the result of the function
     *
     */
    public Function<Integer, Integer> make_fun() {
        // Outside the scope of the returned function:
        int n = 0;
        return arg -> {
            System.out.print(n + " " + arg + ": ");
            arg += 1;
            // n += arg; // Produces error message
            return n + arg;
        };
    }

    public void try_it() {
        Function<Integer, Integer>
                x = make_fun(),
                y = make_fun();
        for(int i = 0; i < 5; i++)
            System.out.println(x.apply(i));
        for(int i = 10; i < 15; i++)
            System.out.println(y.apply(i));
    }

    public void test() {
        try_it();
    }
}