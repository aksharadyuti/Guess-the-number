package com.example.guessthenumber;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class exitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exit);



        Intent intent=getIntent();
        String n = intent.getStringExtra(guessActivity.RESULT);
        int num=Integer.parseInt(n);

        if(num==1){
            TextView textView = findViewById(R.id.textView);
            String str="YOU WON";
            textView.setText(str);
        }
        else if (num==0){
            TextView textView = findViewById(R.id.textView);
            String str="Number should be between 1-100";
            textView.setText(str);
            textView.setBackgroundColor(Color.BLACK);


        }
        else if(num<0){
            TextView textView = findViewById(R.id.textView);
            String str="Your guess is lower";
            textView.setText(str);
            if(num==-1) {
                textView.setBackgroundColor(Color.rgb(234, 114, 26));

            }
            else if(num==-2){
                textView.setBackgroundColor(Color.rgb(234, 80, 26));



            }
            else{
                textView.setBackgroundColor(Color.rgb(255, 0, 0));

            }

        }
        else if(num>6){
            TextView textView = findViewById(R.id.textView);
            String str = "Your guess is higher";
            textView.setText(str);
            if(num==7){
                textView.setBackgroundColor(Color.rgb(26, 187, 234));


            }
            else if(num==8){
                textView.setBackgroundColor(Color.rgb(26, 143, 234));


            }
            else{
                textView.setBackgroundColor(Color.rgb(0,0,255));


            }

        }
        else {
            TextView textView = findViewById(R.id.textView);
            String str = "You LOSE";
            textView.setText(str);
            textView.setBackgroundColor(Color.GRAY);


        }


    }




}
