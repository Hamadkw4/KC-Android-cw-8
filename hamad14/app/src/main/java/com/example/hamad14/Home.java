package com.example.hamad14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Handler handler = new Handler();


        handler.postDelayed(()->{



                Intent g = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(g);
                        finish();

        }, 3000);


    }
}