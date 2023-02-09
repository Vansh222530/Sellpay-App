package com.example.sellpay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
    }
    public void btndone(View view) {
        Intent intent=new  Intent(details.this,MainActivity.class);
        startActivity(intent);

        Toast.makeText(details.this, "Registration Succefull", Toast.LENGTH_SHORT).show();
        
    }
}