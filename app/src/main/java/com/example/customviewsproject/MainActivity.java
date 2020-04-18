package com.example.customviewsproject;

import android.content.Intent;
import android.support.v4.widget.CompoundButtonCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Button;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private MyRadioButton veg;
    private MyRadioButton non;
   private CustomViewButton cbb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        veg = findViewById(R.id.veg);
        non = findViewById(R.id.non);
        cbb = findViewById(R.id.cbb);
    }

    public void setRadiosListener(View v) {
      non.setOwnOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(getApplicationContext(), "Select the button to look for veg dishes", Toast.LENGTH_SHORT).show();
                cbb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent i=new Intent(MainActivity.this,Veg.class);
                        startActivity(i);
                    }
                });
            }

        });
       veg.setOwnOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(getApplicationContext(), "Select the button to look for non-veg dishes", Toast.LENGTH_SHORT).show();
                cbb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(MainActivity.this,Non.class);
                        startActivity(i);
                    }
                });

            }
        });



    }
}
