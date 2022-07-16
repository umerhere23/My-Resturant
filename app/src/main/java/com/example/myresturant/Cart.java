package com.example.myresturant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class Cart extends AppCompatActivity {
TextView q1,q2,q3,q4,p1,p2,p3,p4,item1,item2,item3,item4,tprice,btnclear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        q1=findViewById(R.id.q1);
        q2=findViewById(R.id.q2);
        q3=findViewById(R.id.q3);
        q4=findViewById(R.id.q4);
        p1=findViewById(R.id.p1);
        p2=findViewById(R.id.p2);
        p3=findViewById(R.id.p3);
        p4=findViewById(R.id.p4);
        item1=findViewById(R.id.item1);
        item2=findViewById(R.id.item2);
        item3=findViewById(R.id.item3);
        item4=findViewById(R.id.item4);
        tprice=findViewById(R.id.tprice);
        btnclear=findViewById(R.id.btnclear);

        Bundle bundle=getIntent().getExtras();
       ArrayList<String>arrayList=bundle.getStringArrayList("k");
        String ab =arrayList.get(0);
        String cd = arrayList.get(1);
        String bn = arrayList.get(2);


        item1.setText(ab);
        p1.setText(cd);
        q1.setText(bn);


//        Bundle bundle3=getIntent().getExtras();

//        ArrayList<String>arrayList1=bundle3.getStringArrayList("k1");
//        String xb =arrayList1.get(0);
//        String xd = arrayList1.get(1);
//        String xn = arrayList1.get(2);
//
//        item2.setText(xb);
//        p2.setText(xd);
//        q2.setText(xn);

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q1.setText("0");
                q2.setText("0");
 q3.setText("0");
 q4.setText("0");
 item1.setText("none");
                item2.setText("none");
                item3.setText("none");
                item4.setText("none");
                p1.setText("$ 0.00");
                p2.setText("$ 0.00");
                p3.setText("$ 0.00");
                p4.setText("$ 0.00");
            }
        });


    }
}