package com.example.space_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        Spinner spinner = findViewById(R.id.spinner_n);
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Debit Card");
        arrayList.add("Credit Card");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

    }

    public void pay(View view){
        Intent intent;
        intent = new Intent(this, MainActivity.class);
        startActivity(intent);

        Toast.makeText(payment.this, "Successfull Payment", Toast.LENGTH_LONG).show();
    }



}
