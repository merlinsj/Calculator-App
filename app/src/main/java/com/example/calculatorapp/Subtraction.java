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

public class Subtraction extends AppCompatActivity {
    EditText e1,e2;
    AppCompatButton t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_subtraction);
      e1=(EditText) findViewById(R.id.snum1);
      e2=(EditText) findViewById(R.id.snum2);
      t1=(AppCompatButton) findViewById(R.id.sub);
      t2=(AppCompatButton) findViewById(R.id.bmenu);
      t2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent w= new Intent(getApplicationContext(), MainActivity.class);
              startActivity(w);
          }
      });
      t1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              String nu1= e1.getText().toString();
              String nu2= e2.getText().toString();
              int a1=Integer.parseInt(nu1);
              int a2=Integer.parseInt(nu2);
              int diff=a1-a2;
              Toast.makeText(getApplicationContext(),String.valueOf(diff),Toast.LENGTH_LONG).show();

          }
      });
    }
}