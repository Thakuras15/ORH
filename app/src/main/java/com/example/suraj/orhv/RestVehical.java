package com.example.suraj.orhv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Suraj on 6/24/2017.
 */

public class RestVehical extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rest_or_vehical);

        Button b6=(Button)findViewById(R.id.B6);
        Button b7=(Button)findViewById(R.id.B7);
        Button b8=(Button)findViewById(R.id.B8);
        Button b9=(Button)findViewById(R.id.B9);

        b6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View V) {

                // setContentView(R.layout.activity_main);


            }
        });
        b7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View V) {

                // setContentView(R.layout.activity_main);
                Intent i=new Intent(RestVehical.this,RestRegi.class);
                startActivity(i);


            }
        });
        b8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View V) {

                // setContentView(R.layout.activity_main);


            }
        });
        b9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View V) {

                // setContentView(R.layout.activity_main);


            }
        });

    }}
