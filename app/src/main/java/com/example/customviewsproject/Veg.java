package com.example.customviewsproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Veg extends AppCompatActivity {
  CustomButton button0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veg);
        button0=findViewById(R.id.button0);
        CustomCheckBox checkBox = new CustomCheckBox(getApplicationContext());
        checkBox.setOnCheckedChangeListener(new CustomCheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CustomCheckBox view, boolean isChecked) {
                Toast.makeText(Veg.this, "Selected", Toast.LENGTH_SHORT).show();
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Button clicked", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
