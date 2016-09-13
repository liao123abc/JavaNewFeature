package com.example.liaodongming.javanewfeature.MethodRef;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by liaodongming on 2016/9/12.
 */

public class ReferenceToStaticMethodEx {

    public void test() {

    }

    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for  (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List findPrimeNumbers(List list, Predicate predicate) {
        List sortedNumbers = new ArrayList();
        list.stream().filter((i) -> (predicate.test(i))).forEach((i) -> sortedNumbers.add(i));
        return sortedNumbers;
    }

}
