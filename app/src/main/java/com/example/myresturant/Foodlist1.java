package com.example.myresturant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class Foodlist1 extends AppCompatActivity {
TextView s1,s2,cartbtn,totals;
//    public ArrayList<String>list1=new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodlist1);
        s2=findViewById(R.id.s2);
cartbtn=findViewById(R.id.cartbtn);
totals=findViewById(R.id.totals);
        s1 = findViewById(R.id.s1);
        String vc =getIntent().getStringExtra("ky");
 totals.setText(vc+"$");
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in= new Intent();
                in.setClass(Foodlist1.this,Steaks.class);
                startActivity(in);
            }
        });
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n= new Intent();
                n.setClass(Foodlist1.this,Steak2.class);
                startActivity(n);
            }
        });
        cartbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent();
                a.setClass(Foodlist1.this,Cart.class);
                startActivity(a);
//                String  data5 =getIntent().getStringExtra("112");
//                String jy =getIntent().getStringExtra("p6");
//                list1.add(jy);
//                list1.add(data5);
//                list1.add(vc);
//                Intent intent3= new Intent(Foodlist1.this,Cart.class);
//                intent3.putExtra("k2",list1);
//                startActivity(intent3);
//                finish();

            }
        });
    }
}