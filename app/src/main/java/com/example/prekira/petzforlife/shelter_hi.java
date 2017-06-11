package com.example.prekira.petzforlife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class shelter_hi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final Button next= (Button) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(shelter_hi.this, shelter_allownotifications.class);
                startActivity(i);
            }
        });

    }
}
