package com.example.intendapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        LinearLayout linearLayout = findViewById(R.id.layoutTest);

        Button yes = findViewById(R.id.btn1);
        Button no = findViewById(R.id.btn2);

        TextView textView = findViewById(R.id.txt1);
        TextView textView2 = findViewById(R.id.txt2);
        TextView textView3 = findViewById(R.id.txt3);
        TextView textView4 = findViewById(R.id.txt4);

        String testIntent = getIntent().getStringExtra("firstName");
        String testIntent2 = getIntent().getStringExtra("lastName");
        String testIntent3 = getIntent().getStringExtra("age");
        String testIntent4 = getIntent().getStringExtra("phone");

        textView.setText("FirstName : " + testIntent);
        textView2.setText("LastName : " +testIntent2);
        textView3.setText("Age : " +testIntent3);
        textView4.setText("Phone : " +testIntent4);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity2.this, "Information Submitted SuccessFully", Toast.LENGTH_LONG).show();
                linearLayout.setBackgroundResource(R.color.success);
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity2.this, "Register Fail", Toast.LENGTH_LONG).show();
                linearLayout.setBackgroundResource(R.color.error);
            }
        });

    }


}