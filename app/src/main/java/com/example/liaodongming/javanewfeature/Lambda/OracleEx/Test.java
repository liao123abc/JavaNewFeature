package com.example.liaodongming.javanewfeature.Lambda.OracleEx;

import java.util.List;

/**
 * Created by liaodongming on 2016/10/10.
 */

public class Test {

    public static void printPersonOlderThan(List<Person> roster, int age) {
        for (Person p : roster) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }

    public static void printPersonsWithinAgeRange(
            List<Person> roster, int low, int high) {
        for (Person p : roster) {
            if (low <= p.getAge() && p.getAge() < high) {
                p.printPerson();
            }
        }
    }

    public static void printPersons(
            List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    /**
     * not use Anonymous Class, not lambda
     * @param roster
     */
    public static void noAnonymousSearch(List<Person> roster) {
        printPersons(roster, new CheckPersonEligibleForSelectiveService());
    }

    /**
     *  use Anonymous Class, not lambda
     */
    public static void useAnonymousSearch(List<Person> roster) {
        printPersons(
                roster,
                new CheckPerson() {
                    public boolean test(Person p) {
                        return p.getGender() == Person.Sex.MALE
                                && p.getAge() >= 18
                                && p.getAge() <= 25;
                    }
                }
        );
    }

    /**
     * wow! use Lambda
     */
    public static void useLambda(List<Person> roster) {
        /**
         * A functional interface may contain
         * one or more default methods or static methods
         * 只有一个抽象方法
         */
        printPersons(roster, (Person p) -> p.getGender() == Person.Sex.MALE);
    }

    static class CheckPersonEligibleForSelectiveService implements CheckPerson {

        public boolean test(Person p) {
            return p.gender == Person.Sex.MALE &&
                    p.getAge() >= 18 &&
                    p.getAge() <= 25;
        }
    }
}
