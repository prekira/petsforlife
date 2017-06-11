package com.example.prekira.petzforlife;


import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;

import android.content.Intent;


public class shelter_profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shelter_profile);

        final Button submitbutton = (Button) findViewById(R.id.submitbutton);
        submitbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(shelter_profile.this, shelter_confirmation.class);
                startActivity(i);
            }
        });
    }}


