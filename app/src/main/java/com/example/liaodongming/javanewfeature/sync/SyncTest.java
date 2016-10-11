package com.example.liaodongming.javanewfeature.sync;

import android.util.Log;

/**
 * Created by liaodongming on 2016/9/8.
 */

public class SyncTest {

    private static final String TAG = SyncTest.class.getSimpleName();

    public static synchronized void startEvent(final Integer parameter) {
        int i = 0;
        Log.d(TAG, "enter Thomas " + parameter);
        int j = i + 1;
        int m = j +2;
        new Thread() {
            public void run() {
                    entrySecond();
            }
        }.start();
    }

    /**
     * while(true) 会导致函数会被一直锁定，导致死锁
     */
    public synchronized static void entrySecond() {
        new Thread() {
            public void run() {
                startEvent(9);
            }
        }.start();
        while(true) {
            Log.d(TAG, "running Thomas "/* + parameter*/);
        }
    }

    public void test() {
        final Integer hello = new Integer(5);
        SyncTest.startEvent(hello);
    }

}


