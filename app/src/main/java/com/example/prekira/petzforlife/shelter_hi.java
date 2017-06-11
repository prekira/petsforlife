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
<<<<<<< HEAD:app/src/main/java/com/example/prekira/petzforlife/MainActivity.java
        setContentView(R.layout.activity_main);

       final Button nextQuestion = (Button) findViewById(R.id.otherAnimal);
        nextQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OtherActivity.class);
                startActivity(intent);

            }

        });

        final Button isADog = (Button) findViewById(R.id.isADog);
        isADog.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(MainActivity.this,NextActivity.class);
                startActivity(i);
            }
        });
=======
        setContentView(R.layout.activity_shelter_hi);
>>>>>>> master:app/src/main/java/com/example/prekira/petzforlife/shelter_hi.java
    }
}
