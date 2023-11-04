package com.example.homerenovationtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Drywall_Calculator extends AppCompatActivity {

    Button calculate;
    TextView price;
    TextView sheets;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drywall_calculator);

        price = findViewById(R.id.dry_total_price);
        sheets = findViewById(R.id.dry_total_sheets);
        calculate = (Button) findViewById(R.id.dry_calc_btn);
        calculate.setOnClickListener(bCalculate);
    }
    Button.OnClickListener bCalculate = new Button.OnClickListener()
    {
        @Override
        public void onClick(View v) {

            EditText w1 = (EditText) findViewById(R.id.w1_lenght_input);
            String sW1 = w1.getText().toString();
            Double floatW1 = new Double(sW1).doubleValue();

            EditText w2 = (EditText) findViewById(R.id.w2_length_input);
            String sW2 = w2.getText().toString();
            Double floatW2 = new Double(sW2).doubleValue();

            EditText height = (EditText) findViewById(R.id.height_input);
            String sHeight = height.getText().toString();
            Double floatHeight = new Double(sHeight).doubleValue();

            EditText ppb = (EditText) findViewById(R.id.dry_price_input);
            String sPpb = ppb.getText().toString();
            Double floatPpb = new Double(sPpb).doubleValue();

            if ((floatW1 > 0) || (floatW2 > 0) || (floatHeight > 0))
            {
                double wallArea = (floatW1 * floatHeight) + (floatW2 * floatHeight);

                double s = wallArea / 4608;
                s = Math.round(s * 100);
                s = s/100;

                double p = s * floatPpb;

                price.setText("Total cost is: $" + p);
                sheets.setText("Total sheets needed is: " + s);
            }
            else
            {
                price.setText("Enter a number greater than 0");;
            }
        }

    };
}