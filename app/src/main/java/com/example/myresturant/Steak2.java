package com.example.myresturant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Steak2 extends AppCompatActivity {
Button btns2;
EditText txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steak2);
        btns2=findViewById(R.id.btns2);
        txt2=findViewById(R.id.txts2);
        btns2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent();
                inte.setClass(Steak2.this,Foodlist1.class);
                startActivity(inte);
                finish();

                Toast.makeText(Steak2.this,"Added Sucessfully",Toast.LENGTH_SHORT).show();
                String to=  txt2.getText().toString();
                int va =Integer.parseInt(to);
                Double c= va *19.0;
                String g= String.valueOf(c);
                Intent inten1= new Intent(Steak2.this,Foodlist1.class);
                inten1.putExtra("ky",g);
                inten1.putExtra("p6","Fork Steak");
                inten1.putExtra("112",to);

                startActivity(inten1);
                finish();
            }
        });
    }
}