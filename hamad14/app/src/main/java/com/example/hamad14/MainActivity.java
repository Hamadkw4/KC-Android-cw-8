package com.example.hamad14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ArrayList<KDD>kddArrayList= new ArrayList<>();
    private Object KDDAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Intent intent=new Intent();
        String name= "dsds";


        KDD item1= new KDD("Raspberry","0.50 KD",R.drawable.image22);
        KDD item2= new KDD("Orange","0.50 KD",R.drawable.image33);
        KDD item3= new KDD("Banana","0.50 KD",R.drawable.image44);
        KDD item4= new KDD("Rocket","0.100 KD",R.drawable.image55);
        KDD item5= new KDD("Lulu","0.250 KD",R.drawable.image66);
        KDD item6= new KDD("Basket KDD","5.000 KD",R.drawable.image100);

        kddArrayList.add(item1);
        kddArrayList.add(item2);
        kddArrayList.add(item3);
        kddArrayList.add(item4);
        kddArrayList.add(item5);
        kddArrayList.add(item6);


        KDDAdapter kddAdapter =new KDDAdapter(this, 0, kddArrayList);

        ListView fceafs=findViewById(R.id.Hamd123);
       fceafs.setAdapter(kddAdapter);

       fceafs.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               KDD currentKdd= kddArrayList.get(i);
               Intent intent1= new Intent(MainActivity.this,details.class);
               intent1.putExtra("KDD",currentKdd);
               startActivity(intent1);
           }
       });





    }


    }
