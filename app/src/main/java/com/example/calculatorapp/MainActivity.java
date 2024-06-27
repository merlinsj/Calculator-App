package com.example.calculatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    AppCompatButton bt1,bt2,bt3,bt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
       bt1=(AppCompatButton) findViewById(R.id.addbtn);
       bt2=(AppCompatButton) findViewById(R.id.subtractbtn);
       bt3=(AppCompatButton) findViewById(R.id.multibtn);
       bt4=(AppCompatButton) findViewById(R.id.divbtn);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Division.class);
                startActivity(i);
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(getApplicationContext(),Multiplication.class);
                startActivity(j);
            }
        });
       bt2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
             Intent i=new Intent(getApplicationContext(), Subtraction.class);
             startActivity(i);
           }
       });

       bt1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i= new Intent(getApplicationContext(), Addition.class);
               startActivity(i);
           }
       });
    }
}