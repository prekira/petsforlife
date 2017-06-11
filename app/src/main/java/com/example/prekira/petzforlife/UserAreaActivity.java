package com.example.prekira.petzforlife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        final EditText  etUserame = (EditText) findViewById(R.id.etUserame);
        final TextView  welcomeMessage = (TextView) findViewById(R.id.tvWelcomeMsg);

    }
}
