package com.example.homerenovationtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;

public class Measurements extends AppCompatActivity {

    Button addToList;
    TextView list;
    EditText measurementInput;
    ArrayList<String> fullList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_measurements);

        addToList = (Button) findViewById(R.id.add_to_measure_list_btn);
        addToList.setOnClickListener(bAdd);
        list = findViewById(R.id.measure_list_output);
        measurementInput = findViewById(R.id.measurement_input);
        fullList = new ArrayList<>();
    }
    Button.OnClickListener bAdd = new Button.OnClickListener()
    {
        @Override
        public void onClick(View v) {

            String listInput = measurementInput.getText().toString();

            fullList.add(listInput);

            StringBuilder formattedText = new StringBuilder();
            for(String item : fullList)
            {
                formattedText.append(item).append('\n');
            }

            list.setText(""+formattedText);

            measurementInput.setText("");
        }
    };
}