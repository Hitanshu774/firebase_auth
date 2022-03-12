package com.example.firebase_auth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity {

    private EditText email1;
    private EditText password1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        email1 = findViewById(R.id.email1);
        password1 = findViewById(R.id.password1);
        Button register2 = findViewById(R.id.register2);

        register2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(register.this, "hello", Toast.LENGTH_SHORT).show();
//                String email = email1.getText().toString();
//                String password = password1.getText().toString();
//
//                if(TextUtils.isEmpty(email) || TextUtils.isEmpty(password)){
//                    Toast.makeText(register.this, "Enter email and password!", Toast.LENGTH_SHORT).show();
//                }
            }
        });
    }
}