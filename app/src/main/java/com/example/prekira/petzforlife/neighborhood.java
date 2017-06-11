package com.example.prekira.petzforlife;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class neighborhood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neighborhood);
        final Button petdog = (Button) findViewById(R.id.petdog);
        petdog.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(neighborhood.this, dashboard.class);
                startActivity(i);
            }
        });

    }

   }
