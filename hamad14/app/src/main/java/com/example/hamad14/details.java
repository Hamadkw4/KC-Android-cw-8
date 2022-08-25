package com.example.hamad14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
        Bundle bundle= getIntent().getExtras();
        KDD dedivweweKdd=(KDD) bundle.getSerializable("KDD");

        ImageView g1=findViewById(R.id.imageView3);
        TextView g2=findViewById(R.id.textView123);
        TextView g4=findViewById(R.id.textView2);
       g2.setText(dedivweweKdd.getItemName());
        g1.setImageResource(dedivweweKdd.getItemImage());





    }
}