package com.example.space_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void signin(View view){
        Intent intent2;
        intent2 = new Intent(login.this, activity_two.class);
        startActivity(intent2);
    }

    public void signup(View view){
        Intent intent2;
        intent2 = new Intent(login.this, register.class);
        startActivity(intent2);
    }

}
