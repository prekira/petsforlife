package com.example.prekira.petzforlife.Found_Questionaire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.prekira.petzforlife.R;

public class ActivityTwoHeads extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_heads);

        final Button nextQuestion_one = (Button) findViewById(R.id.prick);
        nextQuestion_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityTwoHeads.this, coloredActivity.class);
                startActivity(intent);

            }

        });
        final Button nextQuestion_two = (Button) findViewById(R.id.side);
        nextQuestion_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityTwoHeads.this, coloredActivity.class);
                startActivity(intent);

            }

        });
        final Button nextQuestion_three = (Button) findViewById(R.id.front);
        nextQuestion_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityTwoHeads.this, coloredActivity.class);
                startActivity(intent);

            }

        });
        final Button nextQuestion_four = (Button) findViewById(R.id.out);
        nextQuestion_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityTwoHeads.this, coloredActivity.class);
                startActivity(intent);

            }

        });
        final Button nextQuestion_five = (Button) findViewById(R.id.down);
        nextQuestion_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityTwoHeads.this, coloredActivity.class);
                startActivity(intent);

            }

        });
        final Button nextQuestion_six = (Button) findViewById(R.id.hound);
        nextQuestion_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityTwoHeads.this, coloredActivity.class);
                startActivity(intent);

            }

        });

    }
}
