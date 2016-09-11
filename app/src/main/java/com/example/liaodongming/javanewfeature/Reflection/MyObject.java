package com.example.liaodongming.javanewfeature.Reflection;

import android.util.Log;

/**
 * Created by liaodongming on 2016/8/31.
 */

public class MyObject {

    private static final String TAG = MyObject.class.getSimpleName();

    private int hello;
    private int world;

    private void sayHi() {
        Log.d(TAG, "say Hi!");
    }

    public MyObject() {
        this.hello = 9;
        this.world = 23;
    }

    protected int calculate() {
        return hello + world;
    }
}
