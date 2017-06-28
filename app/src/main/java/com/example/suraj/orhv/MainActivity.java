package com.example.suraj.orhv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1=(Button)findViewById(R.id.B1);
        Button b2=(Button)findViewById(R.id.B2);
        Button b3=(Button)findViewById(R.id.B3);
        Button b4=(Button)findViewById(R.id.B4);


        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View V) {

                // setContentView(R.layout.activity_main);
                Intent i=new Intent(MainActivity.this,RestVehical.class);
                startActivity(i);


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View V) {

                // setContentView(R.layout.activity_main);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View V) {

                // setContentView(R.layout.activity_main);
                Intent i=new Intent(MainActivity.this,SignUp.class);
                startActivity(i);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View V) {

                // setContentView(R.layout.activity_main);


            }
        });
    }
}
