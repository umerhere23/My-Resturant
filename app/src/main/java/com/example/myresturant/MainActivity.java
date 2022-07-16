package com.example.myresturant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
ImageButton btnburger,btnsteak,btnice,btnsalad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        burger=findViewById(R.id.burger);
//        burger.setBackgroundColor(Color.parseColor("Black"));
////        burger.setBackgroundColor(wi);
        btnburger= (ImageButton) findViewById(R.id.btnburger);
        btnsteak=(ImageButton)findViewById(R.id.btnsteak);
        btnsalad=(ImageButton) findViewById(R.id.btnsalad);
        btnice=(ImageButton)findViewById(R.id.btnice);
btnburger.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent();
        intent.setClass(MainActivity.this,FoodListActivity.class);
        startActivity(intent);

    }
});
btnsteak.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent n = new Intent();
        n.setClass(MainActivity.this,Foodlist1.class);
        startActivity(n);
    }
});

    }
}