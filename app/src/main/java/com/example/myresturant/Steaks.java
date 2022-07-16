package com.example.myresturant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Steaks extends AppCompatActivity {
Button btns1;
EditText steak1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steaks);
        Intent a = new Intent();
        steak1=findViewById(R.id.steak1);
        btns1= findViewById(R.id.btns1);
        btns1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.setClass(Steaks.this,Foodlist1.class);
                startActivity(a);


            }
        });
    }
}