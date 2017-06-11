package com.example.prekira.petzforlife.Database;

import android.location.Location;

import com.example.prekira.petzforlife.Model.Product;

import java.io.File;

/**
 * Created by prekira on 6/11/2017.
 */

public class Data {
    public static void main(String[]args){
        Location x = new Location("X");
        File image = new File("bob.png");
        Product al = new Product("Al",  "A", "password1",  true, false, 100020320, "Billy", "brown", 200, image, "furry",  "round", 200, "dachsund", "111 Ppo street", x, false);

    }
}
