package com.example.java_native_puc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class secondScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        getSupportActionBar().hide();

        ListView lvPersons = (ListView) findViewById(R.id.lvPersons);

        ArrayList<String> persons = new ArrayList<String>();
        persons.add("Musashi");
        persons.add("Tolstoi");
        persons.add("Mario");
        persons.add("Luigi");
        ArrayAdapter<String> aaPersons = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, persons);
        lvPersons.setAdapter(aaPersons);
    }

    public void navigateToFirstScreen(View view) {
        this.finish();
    }
}