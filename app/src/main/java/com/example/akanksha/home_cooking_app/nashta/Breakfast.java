package com.example.akanksha.home_cooking_app.nashta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.akanksha.home_cooking_app.R;

public class Breakfast extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.breakfast);


        button=(Button)findViewById(R.id.aloo_poha_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Breakfast.this, AlooPoha.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.aloo_tikki_Button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Breakfast.this, AlooTikkiChat.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.upma_Button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Breakfast.this, Upma.class);
                startActivity(intent);
            }
        });

        button=(Button)findViewById(R.id.poha_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Breakfast.this, KandhaPoha.class);
                startActivity(intent);
            }
        });

        button=(Button)findViewById(R.id.vada_pav_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Breakfast.this, VadaPav.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.misalpav_Button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Breakfast.this, Misalpav.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.besan_chila_Button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Breakfast.this, BesanChila.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.pav_bhaji_Button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Breakfast.this, PavBhaji.class);
                startActivity(intent);
            }
        }); button=(Button)findViewById(R.id.sandwitch_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Breakfast.this, CucumberSandwitch.class);
                startActivity(intent);
            }
        });


    }
}
