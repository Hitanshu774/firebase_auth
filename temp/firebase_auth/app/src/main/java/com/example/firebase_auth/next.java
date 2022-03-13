package com.example.firebase_auth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class next extends AppCompatActivity {

    private EditText name;
    private EditText age;
    private Button fill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
        fill = findViewById(R.id.fill);

        fill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });
    }
}