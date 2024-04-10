package com.example.assignment_3;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Question_6 extends AppCompatActivity {
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question6);

        ImageSwitcher imageSwitcher = findViewById(R.id.imageSwitcher);
        Button next = findViewById(R.id.nextBtn);

        int [] imageArray = {R.drawable.bulb,R.drawable.bulb_off};

        int length = imageArray.length;

        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView switcherImageView = new ImageView(getApplicationContext());
                return switcherImageView;
            }
        });

        Animation aniOut = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);
        Animation aniIn = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);

        imageSwitcher.setInAnimation(aniIn);
        imageSwitcher.setOutAnimation(aniOut);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                if(counter == length){
                    imageSwitcher.setImageResource(imageArray[0]);
                    counter = 0;
                }
                else {
                    imageSwitcher.setImageResource(imageArray[counter]);
                }
            }
        });



    }
}