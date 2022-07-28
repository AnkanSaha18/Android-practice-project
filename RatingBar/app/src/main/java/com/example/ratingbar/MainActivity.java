package com.example.ratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private RatingBar ratingBar;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar=findViewById(R.id.ratingBarID);
        textView=findViewById(R.id.textViewID);
        textView.setText("rating is :  "+ratingBar.getProgress());

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
//                textView.setText("Rating is :  "+ rating);
                textView.setText("Rating is :  "+ rating+"\nGetProgress is :  "+ratingBar.getProgress());
            }
        });
    }
}
