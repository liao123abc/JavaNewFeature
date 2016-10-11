package com.example.liaodongming.javanewfeature.Lambda.OracleEx;

/**
 * Created by liaodongming on 2016/9/12.
 *
 * http://www.oracle.com/webfolder/technetwork/tutorials/obe/java/Lambda-QuickStart/index.html#section2
 * https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
 */
public class Person {
    public enum Sex {
        MALE, FEMALI
    }

    String name;
    //now in 2016, you can sort of use Java 8 language features in Android development but not use the java.time classes
    //LocalDate birthday;
    String birthday;
    Sex gender;
    String emailAddress;

    public int getAge() {
        return 0;
    }

    public void printPerson() {
        //
    }

    public Sex getGender() {
        return gender;
    }
}