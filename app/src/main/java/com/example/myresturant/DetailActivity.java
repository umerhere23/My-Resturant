package com.example.myresturant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {
Button subb1;
EditText fieldb1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
//        ArrayList<String> quantity= new ArrayList<String>();
subb1=findViewById(R.id.subb1);
fieldb1=findViewById(R.id.fieldb1);

Intent a= new Intent();
subb1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        a.setClass(DetailActivity.this,FoodListActivity.class);
        Toast.makeText(DetailActivity.this,"Added Sucessfully",Toast.LENGTH_SHORT).show();

        startActivity(a);
        String  data =   fieldb1.getText().toString();
        int value=Integer.parseInt(data);
        Double c= value *10.00;
        String b= String.valueOf(c);
        Intent tnt =new Intent(DetailActivity.this,FoodListActivity.class);
        tnt.putExtra("p","Chicken Burger");
        tnt.putExtra("dt",b);
        tnt.putExtra("12",data);

        startActivity(tnt);
        finish();
    }
});

    }
}