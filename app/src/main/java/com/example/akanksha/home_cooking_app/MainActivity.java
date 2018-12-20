package com.example.akanksha.home_cooking_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.akanksha.home_cooking_app.achar.Acchar;
import com.example.akanksha.home_cooking_app.chutney.Chatni;
import com.example.akanksha.home_cooking_app.fastingFood.VratKaPhalhar;
import com.example.akanksha.home_cooking_app.nashta.Breakfast;
import com.example.akanksha.home_cooking_app.roti.RotiParathe;
import com.example.akanksha.home_cooking_app.salad.SaladRayta;

public class MainActivity extends AppCompatActivity {

    Button button;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.saladButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SaladRayta.class);
                startActivity(intent);
            }
        });


        button=(Button)findViewById(R.id.chatniButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Chatni.class);
                startActivity(intent);
            }
        });


        button=(Button)findViewById(R.id.accharButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Acchar.class);
                startActivity(intent);
            }
        });


        button=(Button)findViewById(R.id.breakfastButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Breakfast.class);
                startActivity(intent);
            }
        });

        button=(Button)findViewById(R.id.fastingfoodButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VratKaPhalhar.class);
                startActivity(intent);
            }
        });


        button=(Button)findViewById(R.id.parathaRotiButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RotiParathe.class);
                startActivity(intent);
            }
        });



    }


}

