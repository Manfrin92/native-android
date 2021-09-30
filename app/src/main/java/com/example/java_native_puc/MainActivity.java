package com.example.java_native_puc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        ListView lvCountries = (ListView) findViewById(R.id.lvCountries);

        ArrayList<String> countries = new ArrayList<String>();
        countries.add("Brasil");
        countries.add("EUA");
        countries.add("Chile");
        countries.add("Argentina");
        countries.add("Colombia");
        countries.add("Uruguai");
        countries.add("Venezuela");
        countries.add("Peru");
        countries.add("Suriname");
        countries.add("México");
        ArrayAdapter<String> aaCountries = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, countries);
        lvCountries.setAdapter(aaCountries);

    }

    public void navigate(View view) {
        Intent intentSecondScreen = new Intent(this, secondScreen.class);
        startActivity(intentSecondScreen);
    }
}