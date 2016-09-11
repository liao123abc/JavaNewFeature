package com.example.liaodongming.javanewfeature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.liaodongming.javanewfeature.Annotation.repeatable.RepeatingAnnotations;
import com.example.liaodongming.javanewfeature.Annotation.simple.MySampleAnnotation;
import com.example.liaodongming.javanewfeature.Annotation.simple.MySampleAnnotationClient;

import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RepeatingAnnotations test = new RepeatingAnnotations();
        test.test();
    }
}
