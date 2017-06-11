package com.example.prekira.petzforlife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class shelter_allownotifications extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shelter_allownotifications);

        final Button ok = (Button) findViewById(R.id.ok);
        ok.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(shelter_allownotifications.this, shelter_profile.class);
                startActivity(i);
            }
        });

        final Button cancel = (Button) findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(shelter_allownotifications.this, shelter_hi.class);
                startActivity(i);
            }
        });
    }
}
