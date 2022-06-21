package com.zedr.dhaivat.dietcharts_weightgainandloose;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class gain extends AppCompatActivity {
CardView gone,gtwo,gthree,gfour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gain);

        CardView gone = findViewById(R.id.gone);
        CardView gtwo = findViewById(R.id.gtwo);
        CardView gthree = findViewById(R.id.gthree);
        CardView gfour = findViewById(R.id.gfour);

        gone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),GHabits.class);
                startActivity(intent);
            }
        });
        gtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),GExercise.class);
                startActivity(intent);
            }
        });
        gthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),GDiet.class);
                startActivity(intent);
            }
        });
        gfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),GFoods.class);
                startActivity(intent);
            }
        });

    }
}
