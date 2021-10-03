package com.example.java_native_puc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class fourthScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_screen);
        getSupportActionBar().hide();

        Intent intent = getIntent();
        String[] placesToVisit = (String[])intent.getSerializableExtra("placesToVisit");

        TextView placeToVisit = (TextView) findViewById(R.id.tvImage);
        placeToVisit.setText(placesToVisit[0]);

        ImageView placeToVisitImageName = (ImageView) findViewById(R.id.imageView);
        placeToVisitImageName.setImageResource(R.drawable.redentor);
    }

    public void navigateToPreviousScreen(View view) {
        this.finish();
    }
}