package com.example.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.seekbar.R.drawable.ic_launcher_foreground;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar=findViewById(R.id.seekBarID);
        textView=findViewById(R.id.textViewID);


        textView.setText("Volume :   "+seekBar.getProgress() +'/'+  seekBar.getMax());

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            int temp;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView.setText("Volume :   "+progress +'/'+  seekBar.getMax());


                //this part is for experiment....
                if(fromUser)
                    temp++;
                else
                    temp=0;
                Toast.makeText(MainActivity.this,"hi  "+temp,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar){
                Toast.makeText(MainActivity.this,"onStartTrackingTouch",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this,"onStopTrackingTouch",Toast.LENGTH_SHORT).show();
            }
        });
    }

}
