package com.example.prekira.petzforlife.Model;

import android.location.Location;

import java.io.File;

/**
 * Created by prekira on 6/11/2017.
 */

public class Pets {
    public String name;
    public String color;
    public int  size;
    public File picture;
    public String hair;
    public String head;
    public int weight;
    public String type;
    public String address;
    public Location petLastSeen;
    public boolean isAdult;

    public Pets( String name, String color, int  size, File picture, String hair, String head, int weight, String type, String address, Location petLastSeen, boolean isAdult){
        this.name = name;
        this.color = color;
        this.size = size;
        this.picture = picture;
        this.hair = hair;
        this.head = head;
        this.weight = weight;
        this.type = type;
        this.address= address;
        this.petLastSeen= petLastSeen;
        this.isAdult=isAdult;
    }

}
