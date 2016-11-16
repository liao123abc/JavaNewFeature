package com.example.liaodongming.javanewfeature.Lambda.syntax;

import android.util.Log;

import java.util.function.Consumer;

/**
 * Created by liaodongming on 2016/11/11.
 */

public class LambdaScopeTest {
    private static final String TAG = "LambdaScopeTest";
    public int x = 0;

    class FirstLevel {
        public int x = 1;
        void methodInFirstLevel(int x) {
            Consumer<Integer> myConsumer = (y) -> {
                Log.i(TAG, " x = " + x);
                Log.i(TAG, " y = " + y);
                Log.i(TAG, "this.x = " + this.x);
                Log.i(TAG, "LambdaScopeTest.this.x = " + LambdaScopeTest.this.x);
            };

            myConsumer.accept(x);
        }
    }

    public static void test() {

    }
}
