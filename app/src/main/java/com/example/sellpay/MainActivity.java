package com.example.sellpay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void btnsignup(View view) {
        Intent intent=new Intent(MainActivity.this,signup.class);
        startActivity(intent);
    }

    public void btnsignin(View view) {
        EditText etEmail = findViewById(R.id.email);
        EditText etPassword = findViewById(R.id.pass);
        String email = etEmail.getText().toString();
        String password = etPassword.getText().toString();


        if (email.equals("avpti@gmail.com") && password.equals("ceavpti")) {
            Intent intent = new Intent(this, Homepage.class);
            startActivity(intent);
            Toast.makeText(this,"Login Successful", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Incorrect email or password", Toast.LENGTH_SHORT).show();
        }
        finish();
    }



}