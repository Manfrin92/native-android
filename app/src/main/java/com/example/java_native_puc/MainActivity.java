package com.example.java_native_puc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        Country brasil = new Country("Brasil", "Bolsonaro", new String[] {"Cristo Redentor", "São Paulo", "Curitba"}, "8.516 million km²",
                "208 milhões", "Brasília", "1.445 trillion USD", new Artist[] {
                        new Artist("Zé Ramalho", "Músico", 60, "Nascido no nordeste"),
                        new Artist("Paulo Leminski", "Escritor", 50, "Nascido em Curitiba"),
                        new Artist("Paulo Coelho", "Escritor", 55, "Nascido no Rio de Janeiro"),
        });

        ListView lvCountries = (ListView) findViewById(R.id.lvCountries);

        ArrayList<String> countries = new ArrayList<String>();
        countries.add(brasil.name);
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

        // list of countries
        Country[] countriesInformation = new Country[] {brasil};

        lvCountries.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intentSecondScreen = new Intent(getApplicationContext(), secondScreen.class);
                intentSecondScreen.putExtra("country", countriesInformation[position]);
                startActivity(intentSecondScreen);
            }
        });
    }

    public void navigate(View view) {
        Intent intentSecondScreen = new Intent(this, secondScreen.class);
        startActivity(intentSecondScreen);
    }
}