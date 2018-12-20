package com.example.akanksha.home_cooking_app.salad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.akanksha.home_cooking_app.R;

public class SaladRayta extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.salad_rayta);
        button=(Button)findViewById(R.id.american_salad);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SaladRayta.this, AmericanCornSalad.class);
                startActivity(intent);
            }
        });

        button=(Button)findViewById(R.id.tamater_piyaj_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SaladRayta.this, TamaterPiyajRayta.class);
                startActivity(intent);
            }
        });


        button=(Button)findViewById(R.id.fruit_custerd_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SaladRayta.this, FruitCusterd.class);
                startActivity(intent);
            }
        });

        button=(Button)findViewById(R.id.pinaple_rayta_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SaladRayta.this, PinapleRayta.class);
                startActivity(intent);
            }
        });



        button=(Button)findViewById(R.id.boondi_rayta_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SaladRayta.this, BoondiRayta.class);
                startActivity(intent);
            }
        });

        button=(Button)findViewById(R.id.tomato_cucumber);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SaladRayta.this, TomatoCucumberRayta.class);
                startActivity(intent);
            }
        });


        button=(Button)findViewById(R.id.aloo_rayta_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SaladRayta.this, AlooRayta.class);
                startActivity(intent);
            }
        });

        button=(Button)findViewById(R.id.began_raita);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SaladRayta.this, BeganRaita.class);
                startActivity(intent);
            }
        });




    }

}
