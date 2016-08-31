package com.example.liaodongming.javanewfeature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testingReflection();
    }

    public void testingReflection() {
        Method[] methods = MyObject.class.getMethods();

        for(Method method : methods){
            System.out.println("method = " + method.getName());
        }
    }

}
