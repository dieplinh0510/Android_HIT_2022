package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    EditText mail;
    EditText password;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getId();
        Intent intent = getIntent();
        Account account = intent.getParcelableExtra("account");
        mail.setText("Email or sdt: "+ account.getEmail());
        password.setText("Password: " + account.getPassword());

    }

    private void getId(){
        mail = findViewById(R.id.email);
        password = findViewById(R.id.password);
    }
}