package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {

    Button buttonLogAccount2;
    EditText email;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        getId();
        buttonLogAccount2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
                Account account = new Account();
                account.setEmail(email.getText().toString());
                account.setPassword(password.getText().toString());
                intent.putExtra("account", account);
                startActivity(intent);
            }
        });
    }

    private void getId(){
        buttonLogAccount2 = findViewById(R.id.creatAccountsucc);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
    }

}