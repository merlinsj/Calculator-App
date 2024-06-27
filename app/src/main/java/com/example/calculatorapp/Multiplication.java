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

public class Multiplication extends AppCompatActivity {
    EditText t1,t2;
    AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_multiplication);
       t1=(EditText) findViewById(R.id.mnum1);
       t2=(EditText) findViewById(R.id.mnum2);
       b1=(AppCompatButton) findViewById(R.id.multbtn);
       b2=(AppCompatButton) findViewById(R.id.bcmenu);

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
               String num1=t1.getText().toString();
               String num2=t2.getText().toString();
               int n1=Integer.parseInt(num1);
               int n2=Integer.parseInt(num2);
               int pro=n1*n2;
               Toast.makeText(getApplicationContext(),String.valueOf(pro),Toast.LENGTH_LONG).show();

           }
       });
    }
}