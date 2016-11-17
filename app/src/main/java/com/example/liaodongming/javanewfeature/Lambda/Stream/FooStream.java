package com.example.liaodongming.javanewfeature.Lambda.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by liaodongming on 2016/11/17.
 */

public class FooStream {

    public static void test() {
        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList.stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);//terminal

        IntStream.range(1, 4)
                .mapToObj(i -> "a" + i)
                .forEach(System.out::println);//terminal

    }

}
