package com.example.buttonconfigeration;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textObj;
    private Button buttonObj1;
    private Button buttonObj2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textObj = findViewById(R.id.text);


//      there have many ways to configure multiple buttons.Here are given only two------

//<-----------------------------------No.1---------------------------
//        buttonObj1 =findViewById(R.id.loginButton);
//        buttonObj2=findViewById(R.id.logoutButton);
//
//        buttonObj1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v){
//                textObj.setText("You have successfully logged in");
//            }
//        });
//
//        buttonObj2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                textObj.setText("You have just logged out");
//            }
//        });
//-----------------------------------------------------------------/>
    }


//<--------------------------No.2------------------------------
    @SuppressLint("WrongConstant")
    public  void showMassage(View view)
    {
        if(view.getId()==R.id.loginButton)
        {
            textObj.setText("Congratulation!!! Logged in");
            //Toast.makeText(MainActivity.this,"Congratulation!!",Toast.LENGTH_SHORT).show();
            //in this method this toast will be sohwn olny in the the button
            //you can change it by the following method
            //-----method 1 ------
            Toast toast=Toast.makeText(MainActivity.this,"CONGRATULATION!!!",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,200,200);
            toast.show();
            //-------------------


            //This following line is for Debugging
            //It will be shown in Logcat
            //This mag(massage) will be shown in only on Logcat, not in any interface of of android
            Log.d("tag","Login button is clicked");

        }
        if(view.getId()==R.id.logoutButton)
        {
            //-----method 2-------
            textObj.setText("Successfully Logged out! \nThanks for give us a try");
            Toast.makeText(MainActivity.this,"Good Bye",Toast.LENGTH_SHORT).show();
            //--------------------


            Log.d("tag","Logout button is clicked");
        }
    }
//--------------------------------------------------------------/>

}
