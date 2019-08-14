package com.example.space_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class total extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total);
    }

    public void submit(View view){
        Intent intent;
        intent = new Intent(this, payment.class);
        startActivity(intent);
    }

    public void cancel(View view){
        Intent intent;
        intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }



}
