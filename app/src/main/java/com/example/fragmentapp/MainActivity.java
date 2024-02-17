package com.example.fragmentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//-------- DYNAMIC-FRAGMENTS ----------------
//MAKE FRAGMENT MANAGER ON BUTTON CLICK
//DEPENDS ON APP VERSION -> ANDROID.APP OR ANDROID.X
//MAKE A TRANSACTION IN FM
//FM = getSupportFragmentManager()
//start the transaction FrameTransaction = beginTransaction()
//ADD THE CONTAINER AND THEN COMMIT
// ft.add(ID,new FragmentName);

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button green = findViewById(R.id.greenBtn);
        Button red = findViewById(R.id.redBtn);

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.frameContainer,new DynamicFragment1());
                fragmentTransaction.commit();
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.frameContainer,new DyanamicFragment2());
                fragmentTransaction.commit();
            }
        });

    }


}