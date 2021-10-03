package com.example.java_native_puc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class thirdScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_screen);
        getSupportActionBar().hide();

        Intent intent = getIntent();
        Artist artist = (Artist)intent.getSerializableExtra("artist");

        TextView name = (TextView) findViewById(R.id.tvName);
        name.setText(artist.name);

        TextView type = (TextView) findViewById(R.id.tvType);
        type.setText(artist.type);

        TextView age = (TextView) findViewById(R.id.tvAge);
        age.setText(artist.age);

        TextView about = (TextView) findViewById(R.id.tvAbout);
        about.setText(artist.about);
    }

    public void navigateToSecondScreen(View view) {
        this.finish();
    }
}