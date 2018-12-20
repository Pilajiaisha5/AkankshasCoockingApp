package com.example.akanksha.home_cooking_app.chutney;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.akanksha.home_cooking_app.R;

public class Chatni extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chatni);
        button=(Button)findViewById(R.id.aloo_Poha);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chatni.this, PeanutChatni.class);
                startActivity(intent);
            }
        });


        button=(Button)findViewById(R.id.dry_coconut_chutney);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chatni.this, DryCocunatChutney.class);
                startActivity(intent);
            }
        });

        button=(Button)findViewById(R.id.peanut_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chatni.this, peanut_chutney.class);
                startActivity(intent);
            }
        });


        button=(Button)findViewById(R.id.khajur_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chatni.this, KhajurImliChutney.class);
                startActivity(intent);
            }
        });

        button=(Button)findViewById(R.id.imli_chutney);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chatni.this, ImliChatni.class);
                startActivity(intent);
            }
        });

        button=(Button)findViewById(R.id.pudina_chutney);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chatni.this, PudinaChutney.class);
                startActivity(intent);
            }
        });

        button=(Button)findViewById(R.id.hare_mirch_chutney);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chatni.this, HareMirchKiChutney.class);
                startActivity(intent);
            }
        });

        button=(Button)findViewById(R.id.chana_dal_chutney);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chatni.this, ChanadalChutney.class);
                startActivity(intent);
            }
        });

        button=(Button)findViewById(R.id.raw_tamatar_chutney);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chatni.this, RawTamatarChutney.class);
                startActivity(intent);
            }
        });
    }

}
