package com.example.firebase_auth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity {

    private EditText email2;
    private EditText password2;
    private Button login2;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email2 = findViewById(R.id.email2);
        password2 = findViewById(R.id.password2);
        login2 = findViewById(R.id.login2);
        auth = FirebaseAuth.getInstance();

        login2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = email2.getText().toString();
                String password = password2.getText().toString();

                if(TextUtils.isEmpty(email) || TextUtils.isEmpty(password)){
                    Toast.makeText(login.this, "Enter email and password!", Toast.LENGTH_SHORT).show();
                }
                else{
                    login(email, password);
                }
            }
        });

    }
    private void login(String email, String password){
        auth.signInWithEmailAndPassword(email,password).addOnSuccessListener(login.this, new OnSuccessListener<AuthResult>() {
            @Override
            public void onSuccess(AuthResult authResult) {
                //we can link next page through an intent.
                Toast.makeText(login.this, "Correct password!!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}