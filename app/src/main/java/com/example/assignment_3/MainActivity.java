package com.example.assignment_3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import java.net.URI;
import java.net.URISyntaxException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*--Q1--*/
       /* Button btn = findViewById(R.id.btn);
        EditText moNo = findViewById(R.id.moNo);*/

       /* btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("tel:" + moNo.getText().toString());
                Intent intent = new Intent(Intent.ACTION_DIAL,uri);
                startActivity(intent);
            }
        });*/

        /*--Q3--*/
        /*Button emailBtn = findViewById(R.id.btn);
        EditText email = findViewById(R.id.email);
        EditText subject = findViewById(R.id.subject);
        EditText msg = findViewById(R.id.message);

        emailBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{email.getText().toString()});
                intent.putExtra(Intent.EXTRA_SUBJECT,subject.getText().toString());
                intent.putExtra(Intent.EXTRA_TEXT,msg.getText().toString());

                *//*REMEMBER THIS*//*
                intent.setType("message/rfc822");

                startActivity(intent);
            }
        });*/

        /*Q4*/

        //-------- DYNAMIC-FRAGMENTS ----------------
        //MAKE FRAGMENT MANAGER ON BUTTON CLICK
        //DEPENDS ON APP VERSION -> ANDROID.APP OR ANDROID.X
        //MAKE A TRANSACTION IN FM
        //FM = getSupportFragmentManager()
        //start the transaction FrameTransaction = beginTransaction()
        //ADD THE CONTAINER AND THEN COMMIT
        // ft.add(ID,new FragmentName);



/*          Button frag1 = findViewById(R.id.frag1);
          Button frag2 = findViewById(R.id.frag2);
          Button frag3 = findViewById(R.id.frag3);
          ImageView img = findViewById(R.id.img);

          frag1.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  FragmentManager manager= getSupportFragmentManager();
                  FragmentTransaction transaction =  manager.beginTransaction();
                  transaction.add(R.id.frameContainer,new static1());
                  transaction.commit();

                  *//*Q5 adjust krlo*//*
                  img.setImageResource(R.drawable.bulb);
              }
          });

        frag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager= getSupportFragmentManager();
                FragmentTransaction transaction =  manager.beginTransaction();
                transaction.add(R.id.frameContainer,new static2());
                transaction.commit();

                *//*Q5 adjust krlo*//*
                img.setImageResource(R.drawable.bulb_off);
            }
        });

        frag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager= getSupportFragmentManager();
                FragmentTransaction transaction =  manager.beginTransaction();
                transaction.add(R.id.frameContainer,new static3());
                transaction.commit();
            }
        });*/


        /*Q6 not here */

        Button btn2 = findViewById(R.id.q6);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Question_6.class);
                startActivity(intent);
            }
        });


    }
}