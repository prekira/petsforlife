package com.example.prekira.petzforlife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText  etUserame = (EditText) findViewById(R.id.etUserame);
        final EditText  etPassword = (EditText) findViewById(R.id.etPassword);
        final Button  bLogin = (Button) findViewById(R.id.bLogin);
        final TextView registerLink = (TextView) findViewById(R.id.tvRegisterHere);
        registerLink.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent = new Intent(LoginActivity.this,RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);
            }
        });
    }
}
