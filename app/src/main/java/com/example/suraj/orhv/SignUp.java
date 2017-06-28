package com.example.suraj.orhv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Suraj on 6/24/2017.
 */

public class SignUp extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        Button b5=(Button)findViewById(R.id.B5);


        b5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View V) {

                Intent i=new Intent(SignUp.this,MainActivity.class);
                startActivity(i);

            }
        });
}}
