package com.example.prekira.petzforlife.Model;

import android.location.Location;

import java.io.File;

/**
 * Created by prekira on 6/11/2017.
 */

public class Product {

   public String nameofperson;
    public String username;
    public String password;
    public boolean isPet;
    public Pets pet;
    public int phonenumber;
    static int IDcount = 0;
    public String tagStatuses;


    int ID = 0;

    public Product(String nam, String username1, String password1, boolean havePet, boolean isLost, int phone, String name, String color, int  size, File picture, String hair, String head, int weight, String type, String address, Location petLastSeen, boolean isAdult){
        nameofperson=nam;
       username=username1;
        password=password1;
        IDcount++;
         ID=IDcount;
        isPet=havePet;
        if(isPet){

        }
       pet = new Pets(name,  color,   size,  picture,  hair,  head,  weight,  type,  address,  petLastSeen,  isAdult);
       phonenumber=phone;
    }

    public void changeStatus(String status){
        this.tagStatuses = status;
    }
}
