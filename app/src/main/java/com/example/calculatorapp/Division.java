package com.example.calculatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Division extends AppCompatActivity {
    EditText t1,t2;
    AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_division);
        t1=(EditText) findViewById(R.id.dnum1);
        t2=(EditText) findViewById(R.id.dnum2);
        b1=(AppCompatButton) findViewById(R.id.divbtn);
        b2=(AppCompatButton) findViewById(R.id.bmenubtn);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(s);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String num1=t1.getText().toString();
                    String num2=t2.getText().toString();
                    double n1=Double.parseDouble(num1);
                    double n2=Double.parseDouble(num2);
                    double pro=n1/n2;
                    Toast.makeText(getApplicationContext(),String.valueOf(pro),Toast.LENGTH_LONG).show();
                }
               catch (Exception e)
               {
                   Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_LONG).show();
               }

            }
        });
    }
}