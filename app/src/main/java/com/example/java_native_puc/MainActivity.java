package com.example.java_native_puc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

    public void navigate(View view) {
        // How to display a toast:
        //Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_LONG).show();
        // How to obtain input values:
        EditText etEmail = (EditText) findViewById(R.id.emailAddress);
        EditText etPassword = (EditText) findViewById(R.id.password);
        // How to show this text in the toast
        // Toast.makeText(getApplicationContext(), etEmail.getText(), Toast.LENGTH_LONG).show();
        if (etEmail != null &&
                etEmail.getText() != null &&
                etEmail.getText().length() > 0 &&
                etPassword != null &&
                etPassword.getText() != null &&
                etPassword.getText().length() > 0)
        {
            // How to change screen
            Intent intentSecondScreen = new Intent(this, secondScreen.class);
            startActivity(intentSecondScreen);
        }
    }
}