package com.example.firebase_auth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class register extends AppCompatActivity {

    private EditText email1;
    private EditText password1;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        email1 = findViewById(R.id.email1);
        password1 = findViewById(R.id.password1);
        Button register2 = findViewById(R.id.register2);
        auth = FirebaseAuth.getInstance();

        register2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = email1.getText().toString();
                String password = password1.getText().toString();

                if(TextUtils.isEmpty(email) || TextUtils.isEmpty(password)){
                    Toast.makeText(register.this, "Enter email and password!", Toast.LENGTH_SHORT).show();
                }
                else{
                    regis(email, password);
                }
            }
        });
    }
    private void regis(String email, String password){
        auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(register.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(register.this, "User registered...", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(register.this, "Registration failed!!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}