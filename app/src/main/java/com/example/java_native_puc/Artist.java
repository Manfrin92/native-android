package com.example.java_native_puc;

import java.io.Serializable;

public class Artist implements Serializable {
    String name;
    String type;
    String age;
    String about;

    public Artist(String name, String type, String age, String about) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.about = about;
    }
}
