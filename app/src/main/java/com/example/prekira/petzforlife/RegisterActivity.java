package com.example.prekira.petzforlife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText  etName = (EditText) findViewById(R.id.etName);
        final EditText  etUserame = (EditText) findViewById(R.id.etUserame);
        final EditText  etPassword = (EditText) findViewById(R.id.etPassword);
        final Button  bRegister = (Button) findViewById(R.id.bRegister);
    }
}
