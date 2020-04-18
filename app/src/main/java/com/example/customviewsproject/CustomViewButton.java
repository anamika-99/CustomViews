package com.example.customviewsproject;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;


public class CustomViewButton extends AppCompatButton {

    String buttonName;
    Boolean bColor,bcolorSelected,bText;

    public CustomViewButton(Context context) {
        super(context);
    }

    public CustomViewButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray tarry = context.obtainStyledAttributes(attrs,R.styleable.CustomViewButton);
        try {
            buttonName = tarry.getString(R.styleable.CustomViewButton_buttonName);
            if(buttonName == null) {
                setText("Custom Button");
            }
            else {
                setText("Submit");
            }

            bColor = tarry.getBoolean(R.styleable.CustomViewButton_buttonColor, false);
            if(bColor == true) {
                setBackgroundColor(Color.RED);
            }
            bcolorSelected = tarry.getBoolean(R.styleable.CustomViewButton_buttonColorSelected, false);
            if(bcolorSelected == true) {

                setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        setBackgroundColor(Color.BLUE);

                    }
                });

            }
            bText = tarry.getBoolean(R.styleable.CustomViewButton_btext, false);
            if(bText == true) {
                setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        setTextColor(Color.WHITE);
                        setBackgroundColor(Color.BLUE);
                    }
                });

            }

        }
        finally {
            tarry.recycle();
        }
    }



}
