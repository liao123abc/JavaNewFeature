package com.example.liaodongming.javanewfeature.Lambda.syntax;

import android.content.Context;
import android.view.View;
import android.widget.Button;

import java.util.Arrays;
import java.util.List;

/**
 * Created by liaodongming on 2016/10/18.
 * http://viralpatel.net/blogs/lambda-expressions-java-tutorial/
 */

public class Example {

    public void testThread() {
        //old way:
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from thread");
            }
        });

        //new way:
        new Thread(
                ()-> System.out.println("Hello from thread")
        ).start();
    }

    public void testListener(Context context) {
        Button button = new Button(context);

        //old way:
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //do something
            }
        });

        //new way:
        button.setOnClickListener((v)->{  //v view
            //do something
            v.toString();
            v.bringToFront();
        });
    }

    public void testArray() {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        //Old way:
        for(Integer n: list) {
            System.out.println(n);
        }

        //New way:
        list.forEach(n -> System.out.println(n));
        list.forEach(System.out::println);
    }
}
