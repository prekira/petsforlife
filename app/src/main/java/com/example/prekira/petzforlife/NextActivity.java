package com.example.prekira.petzforlife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        final Button nextQuestion = (Button) findViewById(R.id.hairIsLong);
        nextQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NextActivity.this, ActivityAHead.class);
                startActivity(intent);

            }

        });

        final Button infrontQuestion = (Button) findViewById(R.id.curlyIsTheHair);
        infrontQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NextActivity.this, ActivityAHead.class);
                startActivity(intent);

            }

        });

        final Button nexQuestion = (Button) findViewById(R.id.youAreShort);
        nexQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NextActivity.this, ActivityAHead.class);
                startActivity(intent);

            }

        });

        final Button thequestionthatisahead = (Button) findViewById(R.id.likeWires);
        thequestionthatisahead.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(NextActivity.this,ActivityAHead.class);
                startActivity(i);
            }
        });
    }
}
