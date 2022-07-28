package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton gender;
    Button enterButton;
    TextView genderShow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup=findViewById(R.id.radioGroupID);
        enterButton=findViewById(R.id.enterButtonID);
        genderShow=findViewById(R.id.resultShowID);

        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int selectedID=radioGroup.getCheckedRadioButtonId();
                    gender=findViewById(selectedID);

                    String str;
                    str=gender.getText().toString();
                    genderShow.setText(str);
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this,"Please select your Gender first",Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}
