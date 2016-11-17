package com.example.liaodongming.javanewfeature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.liaodongming.javanewfeature.DefautStatic.Static.B;
import com.example.liaodongming.javanewfeature.Lambda.Stream.FooStream;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test();
            }
        });

        button.setOnClickListener(v -> test());


//        RepeatingAnnotations test = new RepeatingAnnotations();
//        test.test();

//        TestEmployeePredicates.test();
    }

    private void test() {
//        B.test();

        FooStream.test();
    }
}
