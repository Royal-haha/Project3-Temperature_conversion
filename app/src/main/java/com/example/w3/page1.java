package com.example.w3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class page1 extends AppCompatActivity {
    boolean isChanged = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Conversion_button(View view){
        Button button = (Button)findViewById(R.id.button);
        EditText T =(EditText) findViewById(R.id.editText);
        TextView ChangeT =(TextView) findViewById(R.id.textView);
        TextView point =(TextView) findViewById(R.id.pnintVT);
        DecimalFormat nf = new DecimalFormat("0.00");
        char L=50;
        if (isChanged){
            button.setText("轉換華氏(°C)");
            point.setText("溫度(攝氏):");
            double C =Double.parseDouble(T.getText().toString());
            double F= (C*1.8)+32;
            ChangeT.setText(nf.format(F) +"°C");

        }
        else{
            button.setText("轉換攝氏(°F)");
            point.setText("溫度(華氏):");
            double F =Double.parseDouble(T.getText().toString());
            double C= (F-32)/1.8;
            ChangeT.setText(nf.format(C) + "°F");
        }
        T.setText("");
        isChanged=!isChanged;
    }
}