package com.example.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    Scanner sc =new Scanner(System.in);
    private TextView textObj1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textObj1 = findViewById(R.id.heading);
        textObj1.setText("Heading Changed");

    }
}
