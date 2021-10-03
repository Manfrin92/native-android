package com.example.java_native_puc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class secondScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        getSupportActionBar().hide();

        Intent intent = getIntent();
        Country country = (Country)intent.getSerializableExtra("country");

        TextView capital = (TextView) findViewById(R.id.tvPersonsCapital);
        capital.setText(country.capital);

        TextView president = (TextView) findViewById(R.id.tvPresident);
        president.setText(country.president);


    }

    public void navigateToFirstScreen(View view) {
        this.finish();
    }
}