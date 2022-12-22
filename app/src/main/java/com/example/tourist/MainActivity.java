package com.example.tourist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton goa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goa = findViewById(R.id.goa);

        goa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(MainActivity.this,goa.class);
                startActivity(intent);
            }
        });

        ImageButton kutch;

        kutch = findViewById(R.id.kutch);

        kutch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,kutch.class);
                startActivity(intent);
            }
        });

        ImageButton ladakh;

        ladakh = findViewById(R.id.ladakh);

        ladakh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,ladakh.class);
                startActivity(intent);
            }
        });

        ImageButton kerala;

        kerala = findViewById(R.id.kerala);

        kerala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,kerala.class);
                startActivity(intent);
            }
        });

        ImageButton kedarnath;

        kedarnath = findViewById(R.id.kedarnath);

        kedarnath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,kedarnath.class);
                startActivity(intent);
            }
        });

        ImageButton jaisalmer;

        jaisalmer = findViewById(R.id.jaisalmer);

        jaisalmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,jaisalmer.class);
                startActivity(intent);
            }
        });

        ImageButton manali;

        manali = findViewById(R.id.manali);

        manali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,manali.class);
                startActivity(intent);
            }
        });

        ImageButton Ujjain;

        Ujjain = findViewById(R.id.Ujjain);

        Ujjain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,ujjain.class);
                startActivity(intent);
            }
        });
    }
}