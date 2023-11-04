package com.example.homerenovationtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    Button login;
    TextView loginResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = findViewById(R.id.login_btn);
        login.setOnClickListener(bLogin);
        loginResult = findViewById(R.id.login_result);
        loginResult.setOnClickListener(bLogin);
    }
    Button.OnClickListener bLogin = new Button.OnClickListener()
    {
        @Override
        public void onClick(View v) {

            EditText usernameInput = (EditText) findViewById(R.id.username_input);
            String usernameI = usernameInput.getText().toString();

            EditText passwordInput = (EditText) findViewById(R.id.password_input);
            String passwordI = passwordInput.getText().toString();

            if (usernameI.equals("username"))
            {
                if(passwordI.equals("password"))
                {
                    startActivity(new Intent(Login.this, MainActivity.class));
                }
                else
                {
                    loginResult.setText("Incorrect Password");
                }
            }
            else
            {
                loginResult.setText("Incorrect Username");
            }
        }
    };
}