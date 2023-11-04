package com.example.homerenovationtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sqft_Calculator extends AppCompatActivity {

    Button calculate;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqft_calculator);

        result = findViewById(R.id.sqft_result);

        calculate = (Button) findViewById(R.id.sqft_calc_btn);
        calculate.setOnClickListener(bCalculate);
    }
    Button.OnClickListener bCalculate = new Button.OnClickListener()
    {
        @Override
        public void onClick(View v) {

            EditText width = (EditText) findViewById(R.id.width_input);
            String sWidth = width.getText().toString();
            Integer intWidth = new Integer(sWidth).intValue();

            EditText length = (EditText) findViewById(R.id.length_input);
            String sLength = length.getText().toString();
            Integer intLength = new Integer(sLength).intValue();

            if ((intWidth > 0) && (intLength > 0))
            {
                Integer sqftTotal = intLength * intWidth;
                result.setText(sqftTotal + " Square Feet");
            }
            else
            {
                result.setText("Enter a number greater than 0");;
            }
        }

    };
}