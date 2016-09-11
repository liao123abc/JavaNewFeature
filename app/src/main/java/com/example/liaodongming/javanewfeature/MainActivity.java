package com.example.liaodongming.javanewfeature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        testingReflection();
//
//        try {
//            doRegular();
//            doReflection();
//        } catch (Exception e) {
//            //do nothing
//            e.printStackTrace();
//        }

        MySampleAnnotationClient mySampleAnnotationClient = new MySampleAnnotationClient();
        try {
            Method m = mySampleAnnotationClient.getClass().getMethod("myMethod");
            MySampleAnnotation mySampleAnnotation = m.getAnnotation(MySampleAnnotation.class);
            Log.d(TAG, "name is: " + mySampleAnnotation.name() + " age is: " + mySampleAnnotation.age());
        } catch (NoSuchMethodException e) {
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
