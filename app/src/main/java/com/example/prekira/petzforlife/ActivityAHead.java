package com.example.prekira.petzforlife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityAHead extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ahead);

        final Button nextQuestion_one = (Button) findViewById(R.id.dome);
        nextQuestion_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityAHead.this, ActivityTwoHeads.class);
                startActivity(intent);

            }

        });

        final Button nextQuestion_two = (Button) findViewById(R.id.swiperNoSwiping);
        nextQuestion_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityAHead.this, ActivityTwoHeads.class);
                startActivity(intent);

            }

        });

        final Button nextQuestion_three = (Button) findViewById(R.id.isABlock);
        nextQuestion_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityAHead.this, ActivityTwoHeads.class);
                startActivity(intent);

            }

        });

        final Button nextQuestion_four = (Button) findViewById(R.id.Apple);
        nextQuestion_four.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(ActivityAHead.this, ActivityTwoHeads.class);
                startActivity(i);
            }
        });

        final Button nextQuestion_five = (Button) findViewById(R.id.DishOut);
        nextQuestion_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityAHead.this, ActivityTwoHeads.class);
                startActivity(intent);

            }

        });

        final Button nextQuestion_six = (Button) findViewById(R.id.BrokeN);
        nextQuestion_six.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(ActivityAHead.this,ActivityTwoHeads.class);
                startActivity(i);
            }
        });
    }
}
