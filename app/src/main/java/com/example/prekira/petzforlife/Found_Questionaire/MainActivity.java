package com.example.prekira.petzforlife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.prekira.petzforlife.Found_Questionaire.NextActivity;
import com.example.prekira.petzforlife.Found_Questionaire.OtherActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shelter_allownotifications);

        final Button ok = (Button) findViewById(R.id.otherAnimal);
        ok.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(MainActivity.this, OtherActivity.class);
                startActivity(i);
            }
        });

        final Button other = (Button) findViewById(R.id.isADog);
        other.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(MainActivity.this, NextActivity.class);
                startActivity(i);
            }
        });
    }
}

