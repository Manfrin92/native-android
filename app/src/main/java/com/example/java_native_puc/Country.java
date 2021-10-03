package com.example.java_native_puc;

import java.io.Serializable;

public class Country implements Serializable {
    String name;
    String president;
    String[] placesToVisit;
    String area;
    String population;
    String capital;
    String PIB;
    Artist[] artists;

    public Country(String name, String president, String[] placesToVisit, String area, String population, String capital, String PIB, Artist[] artists) {
        this.name = name;
        this.president = president;
        this.placesToVisit = placesToVisit;
        this.area = area;
        this.population = population;
        this.capital = capital;
        this.PIB = PIB;
        this.artists = artists;
    }


}
