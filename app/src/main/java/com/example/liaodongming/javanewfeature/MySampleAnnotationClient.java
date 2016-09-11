package com.example.liaodongming.javanewfeature;

import android.util.Log;

/**
 * Created by liaodongming on 2016/9/4.
 */

public class MySampleAnnotationClient {

    @MySampleAnnotation(name="Alice", age=29)
    public void myMethod() {
        Log.d("Test", "hello");
    }
}
