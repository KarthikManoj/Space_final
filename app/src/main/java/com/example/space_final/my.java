package com.example.space_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class my extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

    public void edit_details(View view){
        Intent intent;
        intent = new Intent(this, update_d.class);
        startActivity(intent);
    }
}
