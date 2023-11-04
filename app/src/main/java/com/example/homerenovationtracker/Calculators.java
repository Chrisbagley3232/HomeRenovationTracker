package com.example.homerenovationtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Calculators extends AppCompatActivity {

    Button sqft_btn;
    Button floor_btn;
    Button drywall_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculators);

        sqft_btn = findViewById(R.id.sqft_btn);
        sqft_btn.setOnClickListener(bSqft);
        floor_btn = findViewById(R.id.flooring_btn);
        floor_btn.setOnClickListener(bFloor);
        drywall_btn = findViewById(R.id.drywall_btn);
        drywall_btn.setOnClickListener(bDrywall);
    }


    Button.OnClickListener bSqft = new Button.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            startActivity(new Intent(Calculators.this, Sqft_Calculator.class));
        }
    };

    Button.OnClickListener bFloor = new Button.OnClickListener()
    {
        @Override
        public void onClick(View v) {startActivity(new Intent(Calculators.this, Flooring_Calculator.class));}
    };

    Button.OnClickListener bDrywall = new Button.OnClickListener()
    {
        @Override
        public void onClick(View v) {startActivity(new Intent(Calculators.this, Drywall_Calculator.class));}
    };
}