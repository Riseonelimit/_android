package com.example.intendapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn1);

        EditText firstName = findViewById(R.id.firstname);
        EditText lastName = findViewById(R.id.lastname);
        EditText agei = findViewById(R.id.age);
        EditText phonei = findViewById(R.id.phone);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fname = firstName.getText().toString();
                String lname = lastName.getText().toString();
                String age = agei.getText().toString();
                String phone = phonei.getText().toString();


                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("firstName",fname);
                intent.putExtra("lastName",lname);
                intent.putExtra("age",age);
                intent.putExtra("phone",phone);
                startActivity(intent);
            }
        });
    }
}