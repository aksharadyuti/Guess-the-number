package com.example.guessthenumber;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;







public class guessActivity extends AppCompatActivity {
    public static final String RESULT = "com.example.myfirstapp.MESSAGE";

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess); }

        int count=0;
    public void enter(View view) {
        // Get the Intent that started this activity and extract the string
        Intent intent3 = new Intent(this, exitActivity.class);
        if (++count < 3) {

            //String n = intent.getStringExtra(MainActivity.NUMBER);
            //int num=Integer.parseInt(n);
            Random rand = new Random();
            int randno = rand.nextInt(100);
            final int randnum = randno + 1;

            //for(int i=0;i<num;i++){
            EditText gn = (EditText) findViewById(R.id.editText);
            Integer gnum = Integer.parseInt(gn.getText().toString());


            if (gnum == randnum) {
                String val = "1";
                intent3.putExtra(RESULT, val);
                startActivity(intent3);

            } else if (gnum < 1 || gnum > 100) {

                String val = "0";
                intent3.putExtra(RESULT, val);
                startActivity(intent3);


            } else if (gnum - randnum < 0) {
                if(randnum-gnum<20){
                    String val = "-1";
                    intent3.putExtra(RESULT, val);
                    startActivity(intent3);

                }
                else if(randnum-gnum<40){
                    String val="-2";
                    intent3.putExtra(RESULT, val);
                    startActivity(intent3);

                }
                else{
                    String val="-3";
                    intent3.putExtra(RESULT, val);
                    startActivity(intent3);
                }



            } else {
                if(randnum-gnum<20){
                    String val="7";
                    intent3.putExtra(RESULT, val);
                    startActivity(intent3);

                }
                else if(randnum-gnum<40){
                    String val="8";
                    intent3.putExtra(RESULT, val);
                    startActivity(intent3);
                }
                else{
                    String val="9";
                    intent3.putExtra(RESULT, val);
                    startActivity(intent3);
                }

            }




        }
        else{
            String val = "5";
            intent3.putExtra(RESULT, val);
            startActivity(intent3);

            finish();
        }


    }
    }



