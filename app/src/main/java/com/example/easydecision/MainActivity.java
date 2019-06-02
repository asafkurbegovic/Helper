package com.example.easydecision;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    public void generate(View view){
        Random rand = new Random();
        EditText number= (EditText) findViewById(R.id.number);
        int nbr = Integer.parseInt(number.getText().toString());
        String text = number.getText().toString().trim();

        try {
            int len =1+rand.nextInt(9);
            int temp = 0;

            for (int i = 0; i<len;i++){
                temp = 1 + rand.nextInt(nbr);
            }

            TextView output = (TextView) findViewById(R.id.randomNumber);

            output.setText(String.valueOf(temp));
        }

        catch (Exception e){
            Toast.makeText(MainActivity.this,e.getMessage(),Toast.LENGTH_SHORT).show();
        }

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
    }
}
