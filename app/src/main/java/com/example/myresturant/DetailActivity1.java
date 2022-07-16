package com.example.myresturant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class DetailActivity1 extends AppCompatActivity {
Button btnsub2;
EditText field2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail1);

        Intent a = new Intent();
        btnsub2= findViewById(R.id.btnsub2);
        field2= findViewById(R.id.field2);

        btnsub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Intent add=new Intent(DetailActivity1.this,FoodListActivity.class);
//                add.putExtra("stringarray",quantity1);
//                startActivity(add);

//         quantity1.add( field2.getText().toString());


                a.setClass(DetailActivity1.this,FoodListActivity.class);
                startActivity(a);
                Toast.makeText(DetailActivity1.this,"Added Sucessfully",Toast.LENGTH_SHORT).show();
                String tot=  field2.getText().toString();
                int finalValue=Integer.parseInt(tot);
                Double c= finalValue *10.99;
                String g= String.valueOf(c);

                Intent intent1= new Intent(DetailActivity1.this,FoodListActivity.class);
                intent1.putExtra("key",g);
                startActivity(intent1);



                finish();


            }
        });

    }

}