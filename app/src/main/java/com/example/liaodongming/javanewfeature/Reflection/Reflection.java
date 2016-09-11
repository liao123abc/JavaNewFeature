package com.example.liaodongming.javanewfeature.Reflection;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/9/11.
 */

public class Reflection {

    private static final String TAG = Reflection.class.getSimpleName();

    public void test() {
        testingReflection();

        try {
            doRegular();
            doReflection();
        } catch (Exception e) {
            //do nothing
            e.printStackTrace();
        }
    }

    public void testingReflection() {
        Method[] methods = MyObject.class.getMethods();

        for(Method method : methods){
            System.out.println("method = " + method.getName());
        }

        Class myObjectClass = AppCompatActivity.class;
        Class superclass = myObjectClass.getSuperclass();
        Log.d(TAG, "get class " + superclass.getSimpleName());

        Package myPackage = superclass.getPackage();
        Log.d(TAG, "package is " + myPackage.toString());

        Class[] interfaces = superclass.getInterfaces();
        for (Class my : interfaces) {
            Log.d(TAG, "interface: " + my.toString());
        }

        Constructor[] constructors = superclass.getConstructors();
        for (Constructor constructor : constructors) {
            Log.d(TAG, "construct : " + constructor.toString());
        }

        Method[] methods2 = superclass.getMethods();
        for(Method method : methods2){
            Log.d(TAG, "method = " + method.getName());
        }

        Annotation[] annotations = superclass.getAnnotations();
        for (Annotation annotation : annotations) {
            Log.d(TAG, "annotation : " + annotation);
        }
    }

    public static void doRegular() throws Exception {
        long start = System.currentTimeMillis();
        for (int i=0; i<1000000; i++) {
            A a = new A();
            a.doSomeThing();
        }
        System.out.println(System.currentTimeMillis() - start);//78
    }

    public static void doReflection() throws Exception {
        long start = System.currentTimeMillis();
        for (int i=0; i<1000000; i++) {
            Class myclass = A.class;
            A a = (A)myclass.newInstance();//1059
            //A a = (A) Class.forName("A").newInstance();
            a.doSomeThing();
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
