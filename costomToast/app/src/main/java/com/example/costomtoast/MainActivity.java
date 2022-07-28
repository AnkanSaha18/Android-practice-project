package com.example.costomtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button b;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(R.layout.custom_toast_layout);

        b=findViewById(R.id.button_id);
        b.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        LayoutInflater inflater=getLayoutInflater();
        View customView = inflater.inflate(R.layout.custom_toast_layout, (ViewGroup) findViewById(R.id.customToast_id));
        Toast toast=new Toast(MainActivity.this);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setView(customView);
        toast.show();

        try {
            image=findViewById(R.id.image_id);
            image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this,"Button in toast is working",Toast.LENGTH_SHORT).show();
                }
            });
        } catch (Exception e) {
            Toast.makeText(MainActivity.this,"Experiment failed",Toast.LENGTH_SHORT).show();
        }

    }
}
