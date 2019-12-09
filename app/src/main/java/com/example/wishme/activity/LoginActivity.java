package com.example.wishme.activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.wishme.R;

public class LoginActivity extends AppCompatActivity {

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Controls from Login page : username, password and the Sign In button
        final EditText etUserName = findViewById(R.id.login_email);
        final EditText etPassword = findViewById(R.id.login_password);
        AppCompatButton btnLogin = findViewById(R.id.btnSignIn);

        //OnClickListener for the Sign In button on Login page
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = etUserName.getText().toString();
                String password = etPassword.getText().toString();

                //Toast for short duration
               /* Toast
                        .makeText(getApplicationContext(), username +" : "+password, Toast.LENGTH_LONG)
                        .show();
                Toast
                        .makeText(getApplicationContext(), password, Toast.LENGTH_SHORT)
                        .show(); */
                if (username.equals("username") && password.equals("password")) {
                    Intent intent = new Intent(getApplicationContext(), WelcomeActivity.class);
                    startActivity(intent);
                } else {
                    Toast
                            .makeText(getApplicationContext(), "Invalid Credentials", Toast.LENGTH_SHORT)
                            .show();
                }


            }
        });

    }

    public void processSignupLinkClick(View view){
        Intent intent=new Intent(this, Registration.class);
        startActivity(intent);
    }
}
