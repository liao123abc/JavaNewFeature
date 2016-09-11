package com.example.liaodongming.javanewfeature.Annotation.simple;

import android.util.Log;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/9/11.
 */

public class Test {

    private static final String TAG = Test.class.getSimpleName();

    public void test() {
        MySampleAnnotationClient mySampleAnnotationClient = new MySampleAnnotationClient();
        try {
            Method m = mySampleAnnotationClient.getClass().getMethod("myMethod");
            MySampleAnnotation mySampleAnnotation = m.getAnnotation(MySampleAnnotation.class);
            Log.d(TAG, "name is: " + mySampleAnnotation.name() + " age is: " + mySampleAnnotation.age());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

}
