package com.example.space_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class monthly extends AppCompatActivity {

    static final int REQUEST_IMAGE_CAPTURE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monthly);

        Spinner spinner = findViewById(R.id.nspinner5);
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Home");
        arrayList.add("Room");


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);


        Spinner spinner2 = findViewById(R.id.nspinner6);
        ArrayList<String> arrayList2 = new ArrayList<>();

        arrayList2.add("No of Rooms");
        arrayList2.add("1");
        arrayList2.add("2");
        arrayList2.add("3");
        arrayList2.add("4");
        arrayList2.add("5");
        arrayList2.add("6");
        arrayList2.add("7");
        arrayList2.add("8");
        arrayList2.add("9");
        arrayList2.add("9+");



        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, arrayList2);
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(arrayAdapter2);

        Spinner spinner3 = findViewById(R.id.nspinner7);
        ArrayList<String> arrayList3 = new ArrayList<>();

        arrayList3.add("Parking Facility");
        arrayList3.add("Yes");
        arrayList3.add("No");


        ArrayAdapter<String> arrayAdapter3 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, arrayList3);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(arrayAdapter3);


        Spinner spinner4 = findViewById(R.id.nspinner8);
        ArrayList<String> arrayList4 = new ArrayList<>();

        arrayList4.add("Furnished");
        arrayList4.add("Yes");
        arrayList4.add("No");


        ArrayAdapter<String> arrayAdapter4 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, arrayList4);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(arrayAdapter4);




    }


    public void takePic(View view) {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if(takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }

    public void address(View view){
        Intent intent;
        intent = new Intent(this, address.class);
        startActivity(intent);
    }
}
