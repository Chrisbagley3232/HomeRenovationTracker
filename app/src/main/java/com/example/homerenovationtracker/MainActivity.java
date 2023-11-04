package com.example.homerenovationtracker;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button materials_btn;
    Button calculators_btn;
    Button measurements_btn;
    Button login_page_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        materials_btn = findViewById(R.id.materials_btn);
        materials_btn.setOnClickListener(bMaterials);
        calculators_btn = findViewById(R.id.calculators_btn);
        calculators_btn.setOnClickListener(bCalculators);
        measurements_btn = findViewById(R.id.measurements_btn);
        measurements_btn.setOnClickListener(bMeasurements);
        login_page_btn = findViewById(R.id.login_page_btn);
        login_page_btn.setOnClickListener(bLoginPage);
    }

    Button.OnClickListener bMaterials = new Button.OnClickListener()
    {
        @Override
        public void onClick(View v) {startActivity(new Intent(MainActivity.this, Materials.class));}
    };

    Button.OnClickListener bCalculators = new Button.OnClickListener()
    {
        @Override
        public void onClick(View v) {startActivity(new Intent(MainActivity.this, Calculators.class));}
    };

    Button.OnClickListener bMeasurements = new Button.OnClickListener()
    {
        @Override
        public void onClick(View v) {startActivity(new Intent(MainActivity.this, Measurements.class));}
    };

    Button.OnClickListener bLoginPage = new Button.OnClickListener()
    {
        @Override
        public void onClick(View v) {startActivity(new Intent(MainActivity.this, Login.class));}
    };
}