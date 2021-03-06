package com.example.java_native_puc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class secondScreen extends AppCompatActivity {
    String[] placesToVisit = new String[] {};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        getSupportActionBar().hide();

        Intent intent = getIntent();
        Country country = (Country)intent.getSerializableExtra("country");

        this.placesToVisit = country.placesToVisit;

        TextView president = (TextView) findViewById(R.id.tvPresident);
        president.setText(country.president);

        TextView area = (TextView) findViewById(R.id.tvArea);
        area.setText(country.area);

        TextView population = (TextView) findViewById(R.id.tvPopulation);
        population.setText(country.population);

        TextView capital = (TextView) findViewById(R.id.tvCapital);
        capital.setText(country.capital);

        TextView PIB = (TextView) findViewById(R.id.tvPIB);
        PIB.setText(country.PIB);

        ListView lvArtists = (ListView) findViewById(R.id.lvArtists);

        ArrayList<String> artists = new ArrayList<String>();
        artists.add(country.artists[0].name);
        artists.add(country.artists[1].name);
        artists.add(country.artists[2].name);

        ArrayAdapter<String> aaArtists = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, artists);
        lvArtists.setAdapter(aaArtists);

        // list of countries
        Artist[] artistsInformation = country.artists;

        lvArtists.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intentThirdScreen = new Intent(getApplicationContext(), thirdScreen.class);
                intentThirdScreen.putExtra("artist", artistsInformation[position]);
                startActivity(intentThirdScreen);
            }
        });
    }

    public void navigateToFirstScreen(View view) {
        this.finish();
    }

    public void HideAboutContries() {
        TextView presidentQuestion = (TextView) findViewById(R.id.tvPresidentQuestion);
        TextView president = (TextView) findViewById(R.id.tvPresident);
        presidentQuestion.setVisibility(View.INVISIBLE);
        president.setVisibility(View.INVISIBLE);

        TextView areaQuestion = (TextView) findViewById(R.id.tvAreaQuestion);
        TextView area = (TextView) findViewById(R.id.tvArea);
        area.setVisibility(View.INVISIBLE);
        areaQuestion.setVisibility(View.INVISIBLE);


        TextView populationQuestion = (TextView) findViewById(R.id.tvPopulationQuestion);
        TextView population = (TextView) findViewById(R.id.tvPopulation);
        population.setVisibility(View.INVISIBLE);
        populationQuestion.setVisibility(View.INVISIBLE);

        TextView capitalQuestion = (TextView) findViewById(R.id.tvCapitalQuestion);
        TextView capital = (TextView) findViewById(R.id.tvCapital);
        capital.setVisibility(View.INVISIBLE);
        capitalQuestion.setVisibility(View.INVISIBLE);


        TextView PIBQuestion = (TextView) findViewById(R.id.tvPIBQuestion);
        TextView PIB = (TextView) findViewById(R.id.tvPIB);
        PIB.setVisibility(View.INVISIBLE);
        PIBQuestion.setVisibility(View.INVISIBLE);
    }

    public void handleShowAboutCountry(View view) {
        this.HideArtists();

        TextView presidentQuestion = (TextView) findViewById(R.id.tvPresidentQuestion);
        TextView president = (TextView) findViewById(R.id.tvPresident);
        if (president.getVisibility() == View.VISIBLE) {
            presidentQuestion.setVisibility(View.INVISIBLE);
            president.setVisibility(View.INVISIBLE);
        } else {
            presidentQuestion.setVisibility(View.VISIBLE);
            president.setVisibility(View.VISIBLE);
        }        

        TextView areaQuestion = (TextView) findViewById(R.id.tvAreaQuestion);
        TextView area = (TextView) findViewById(R.id.tvArea);
        if (area.getVisibility() == View.VISIBLE) {
            area.setVisibility(View.INVISIBLE);
            areaQuestion.setVisibility(View.INVISIBLE);
        } else {
            area.setVisibility(View.VISIBLE);
            areaQuestion.setVisibility(View.VISIBLE);
        }

        TextView populationQuestion = (TextView) findViewById(R.id.tvPopulationQuestion);
        TextView population = (TextView) findViewById(R.id.tvPopulation);
        if (population.getVisibility() == View.VISIBLE) {
            population.setVisibility(View.INVISIBLE);
            populationQuestion.setVisibility(View.INVISIBLE);
        } else {
            population.setVisibility(View.VISIBLE);
            populationQuestion.setVisibility(View.VISIBLE);
        }

        TextView capitalQuestion = (TextView) findViewById(R.id.tvCapitalQuestion);
        TextView capital = (TextView) findViewById(R.id.tvCapital);
        if (capital.getVisibility() == View.VISIBLE) {
            capital.setVisibility(View.INVISIBLE);
            capitalQuestion.setVisibility(View.INVISIBLE);
        } else {
            capital.setVisibility(View.VISIBLE);
            capitalQuestion.setVisibility(View.VISIBLE);
        }

        TextView PIBQuestion = (TextView) findViewById(R.id.tvPIBQuestion);
        TextView PIB = (TextView) findViewById(R.id.tvPIB);
        if (PIB.getVisibility() == View.VISIBLE) {
            PIB.setVisibility(View.INVISIBLE);
            PIBQuestion.setVisibility(View.INVISIBLE);
        } else {
            PIB.setVisibility(View.VISIBLE);
            PIBQuestion.setVisibility(View.VISIBLE);
        }
    }

    public void HideArtists() {
        ListView artists = (ListView) findViewById(R.id.lvArtists);
        artists.setVisibility(View.INVISIBLE);
    }

    public void handleShowArtists(View view) {
        this.HideAboutContries();

        ListView artists = (ListView) findViewById(R.id.lvArtists);
        if (artists.getVisibility() == View.VISIBLE) {
            artists.setVisibility(View.INVISIBLE);
        } else {
            artists.setVisibility(View.VISIBLE);
        }
    }

    public void navigateToPlacesToSee(View view) {
        Intent intentFourthScreen = new Intent(getApplicationContext(), fourthScreen.class);
        intentFourthScreen.putExtra("placesToVisit", this.placesToVisit);
        startActivity(intentFourthScreen);
    }

}