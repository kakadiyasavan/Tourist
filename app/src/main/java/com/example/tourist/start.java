package com.example.tourist;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class start extends AppCompatActivity {
ImageView air;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        air=findViewById(R.id.air);



                Intent intant = new Intent(start.this,MainActivity.class);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {startActivity(intant);

                    }
                },2000);



    }
}