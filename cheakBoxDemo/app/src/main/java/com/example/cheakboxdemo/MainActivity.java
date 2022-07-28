package com.example.cheakboxdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox iceCreamCheckBox,cakeCheckBox,sweetCheckBox;
    Button pressedOrder;
    TextView orderList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iceCreamCheckBox=findViewById(R.id.ice_creamID);
        cakeCheckBox=findViewById(R.id.cakeID);
        sweetCheckBox=findViewById(R.id.sweetID);

        pressedOrder=findViewById(R.id.buttonID);

        orderList=findViewById(R.id.orderListID);


        pressedOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder=new StringBuilder();

                if(iceCreamCheckBox.isChecked())
                {
                    String temp=iceCreamCheckBox.getText().toString();
                    stringBuilder.append(temp+" is ordered"+"\n");
                }
                if(cakeCheckBox.isChecked())
                {
                    String temp=cakeCheckBox.getText().toString();
                    stringBuilder.append(temp+" is ordered"+"\n");
                }
                if(sweetCheckBox.isChecked())
                {
                    String temp=sweetCheckBox.getText().toString();
                    stringBuilder.append(temp+" is ordered"+"\n");
                }

                //in checkBox you  can select multiple item
                //But in radioButton there may have multiple option but you can select  only one..
                orderList.setText(stringBuilder);
            }
        });

    }
}
