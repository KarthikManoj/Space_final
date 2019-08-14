package com.example.space_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class update_d extends AppCompatActivity {

    static final int REQUEST_IMAGE_CAPTURE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_d);


        Spinner spinner = findViewById(R.id.first);
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Home");
        arrayList.add("Room");


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);


        Spinner spinner2 = findViewById(R.id.second);
        ArrayList<String> arrayList2 = new ArrayList<>();

        arrayList2.add("Furnished");
        arrayList2.add("Yes");
        arrayList2.add("No");




        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, arrayList2);
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(arrayAdapter2);

        Spinner spinner3 = findViewById(R.id.third);
        ArrayList<String> arrayList3 = new ArrayList<>();

        arrayList3.add("Wifi");
        arrayList3.add("Yes");
        arrayList3.add("No");


        ArrayAdapter<String> arrayAdapter3 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, arrayList3);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(arrayAdapter3);


        Spinner spinner4 = findViewById(R.id.fourth);
        ArrayList<String> arrayList4 = new ArrayList<>();

        arrayList4.add("Separate Television");
        arrayList4.add("Yes");
        arrayList4.add("No");


        ArrayAdapter<String> arrayAdapter4 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, arrayList4);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(arrayAdapter4);

        Spinner spinner5 = findViewById(R.id.fifth);
        ArrayList<String> arrayList5 = new ArrayList<>();

        arrayList5.add("Parking Facility");
        arrayList5.add("Yes");
        arrayList5.add("No");


        ArrayAdapter<String> arrayAdapter5 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, arrayList5);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(arrayAdapter5);

    }

    public void takePic(View view) {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if(takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }

}
