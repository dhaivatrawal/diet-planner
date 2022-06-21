package com.zedr.dhaivat.dietcharts_weightgainandloose;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class loose extends AppCompatActivity {
    CardView lone,ltwo,lthree,lfour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loose);


        CardView lone = findViewById(R.id.lone);
        CardView ltwo = findViewById(R.id.ltwo);
        CardView lthree = findViewById(R.id.lthree);
        CardView lfour = findViewById(R.id.lfour);

        lone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),LHabits.class);
                startActivity(intent);
            }
        });
        ltwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),LExercise.class);
                startActivity(intent);
            }
        });
        lthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),LDiet.class);
                startActivity(intent);
            }
        });
        lfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),LFoods.class);
                startActivity(intent);
            }
        });

    }
}
