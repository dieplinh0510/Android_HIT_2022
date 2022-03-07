package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    Button buttonLogAccount;
    Button buttonCreatAccount;
    EditText emailOrSDT;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getId();
        buttonLogAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                Account account = new Account();
                account.setEmail(emailOrSDT.getText().toString());
                account.setPassword(password.getText().toString());
                intent.putExtra("account", account);
                startActivity(intent);
            }
        });


        buttonCreatAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, MainActivity3.class);


                startActivity(intent1);
            }
        });



    }

    private void getId(){
        buttonLogAccount = findViewById(R.id.loginAccount);
        buttonCreatAccount = findViewById(R.id.creatAccount);
        emailOrSDT = findViewById(R.id.editTextTextPersonName2);
        password = findViewById(R.id.editTextTextPassword);
    }


}