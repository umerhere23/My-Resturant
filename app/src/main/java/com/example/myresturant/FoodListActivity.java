package com.example.myresturant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class FoodListActivity extends AppCompatActivity {
TextView bug1,bug2,bug3,bug4,bug5,totalburger;
Button btncart;
    public ArrayList<String>list2=new ArrayList<String>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);

//        Bundle bundle=getIntent().getExtras();
//       ArrayList<String>arrayList=bundle.getStringArrayList("stringarray");
        totalburger=findViewById(R.id.totalburger);
// String ab =arrayList.get(0);



        bug1=findViewById(R.id.bug1);
        bug3=findViewById(R.id.bug3);
        btncart=findViewById(R.id.btncart);

       String  ac =getIntent().getStringExtra("key");
         String dc=getIntent().getStringExtra("dt");

    totalburger.setText("Total :" + dc );


        bug1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent();
                i.setClass(FoodListActivity.this,DetailActivity.class);
                startActivity(i);
                finish();

            }
        });
        bug3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bug3 = new Intent();
                bug3.setClass(FoodListActivity.this,DetailActivity1.class);
                startActivity(bug3);
            }
        });
        btncart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent();
                a.setClass(FoodListActivity.this,Cart.class);
                startActivity(a);
                String  data =getIntent().getStringExtra("12");
                String  data3 =getIntent().getStringExtra("p");

                list2.add(data3);
                list2.add(data);
                list2.add(dc);
                Intent intent4= new Intent(FoodListActivity.this,Cart.class);
                intent4.putExtra("k",list2);
                startActivity(intent4);
            }
        });
    }
}