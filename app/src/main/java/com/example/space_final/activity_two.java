package com.example.space_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_two extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
    }

    public void monthly(View view){
        Intent intent2;
        intent2 = new Intent(activity_two.this, monthly.class);
        startActivity(intent2);
    }

    public void daily(View view){
        Intent intent3;
        intent3 = new Intent(activity_two.this, daily.class);
        startActivity(intent3);
    }


    public void profile(View view){
        Intent intent3;
        intent3 = new Intent(activity_two.this, user_profile.class);
        startActivity(intent3);
    }

    public void my(View view){
        Intent intent3;
        intent3 = new Intent(activity_two.this, my.class);
        startActivity(intent3);
    }
}
