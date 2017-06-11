package com.example.prekira.petzforlife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.prekira.petzforlife.Found_Questionaire.NextActivity;
import com.example.prekira.petzforlife.Found_Questionaire.OtherActivity;

public class shelter_hi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
<<<<<<< HEAD
        setContentView(R.layout.activity_shelter_hi);
=======

        final Button next= (Button) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(shelter_hi.this, shelter_allownotifications.class);
                startActivity(i);
            }
        });
>>>>>>> master

    }
}
