package com.example.myedittextdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText text1,text2;
    private Button ad,sub,mul,div;
    private TextView result;
    private ImageView test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1=findViewById(R.id.firstNumber);
        text2=findViewById(R.id.secondNumber);

        ad=findViewById(R.id.plus);
        sub=findViewById(R.id.minus);
        mul=findViewById(R.id.multiple);
        div=findViewById(R.id.divider);

        result=findViewById(R.id.result);
        test=findViewById(R.id.imageTest);

        ad.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);

        result.setOnClickListener(this);  ///you can set_onclick_listener for any class you want
        test.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.result)
        {
            Toast.makeText(this,"setting onclick for TextView",Toast.LENGTH_SHORT).show();
            //this portion is just for testing that you can click a test view and it will work like a button
        }
        if(v.getId()==R.id.imageTest)
        {
            Toast.makeText(this,"Thanks for clicking Image",Toast.LENGTH_SHORT).show();
        }
        try {

            String str1 = text1.getText().toString();
            String str2 = text2.getText().toString();

            double num1 = Double.parseDouble(str1);
            double num2 = Double.parseDouble(str2);

            if (v.getId() == R.id.plus) {
                result.setText("Result: " + (num1 + num2));
            }
            else if (v.getId() == R.id.minus) {
                result.setText("Result: " + (num1 - num2));
            }
            else if (v.getId() == R.id.multiple) {
                result.setText("Result: " + (num1 * num2));
            }
            else if (v.getId() == R.id.divider) {
                result.setText("Result: " + (num1 / num2));
            }
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Please enter number", Toast.LENGTH_SHORT).show();
        }


    }
}
