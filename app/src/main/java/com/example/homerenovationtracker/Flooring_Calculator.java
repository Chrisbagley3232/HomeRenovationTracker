package com.example.homerenovationtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Flooring_Calculator extends AppCompatActivity {

    Button calculate;
    TextView price;
    TextView boxes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flooring_calculator);

        price = findViewById(R.id.total_price);
        boxes = findViewById(R.id.total_boxes);
        calculate = (Button) findViewById(R.id.floor_calc_btn);
        calculate.setOnClickListener(bCalculate);
    }
    Button.OnClickListener bCalculate = new Button.OnClickListener()
    {
        @Override
        public void onClick(View v) {

            EditText width = (EditText) findViewById(R.id.f_width_input);
            String sWidth = width.getText().toString();
            Double floatWidth = new Double(sWidth).doubleValue();

            EditText length = (EditText) findViewById(R.id.f_length_input);
            String sLength = length.getText().toString();
            Double floatLength = new Double(sLength).doubleValue();

            EditText coverage = (EditText) findViewById(R.id.f_coverage_input);
            String sCoverage = coverage.getText().toString();
            Double floatCoverage = new Double(sCoverage).doubleValue();

            EditText ppb = (EditText) findViewById(R.id.f_price_input);
            String sPpb = ppb.getText().toString();
            Double floatPpb = new Double(sPpb).doubleValue();

            if ((floatWidth > 0) || (floatLength > 0) || (floatCoverage > 0))
            {
                double sqft = floatWidth * floatLength;

                double box = sqft / floatCoverage;
                box = Math.round(box * 100);
                box = box/100;

                double p = box * floatPpb;

                double totalP = p + (p * 0.1);
                totalP = Math.round(totalP * 100);
                totalP = totalP/100;

                price.setText("Total cost is: $" + totalP);
                boxes.setText("Total boxes needed is: " + box);
            }
            else
            {
                price.setText("Enter a number greater than 0");;
            }
        }

    };
}