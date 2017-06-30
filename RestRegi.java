package com.example.suraj.orhv;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
//import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

/**
 * Created by Suraj on 6/24/2017.
 */

public class RestRegi extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resthouse_regpage);


        Button b10 = (Button) findViewById(R.id.B10);
        Button b11 = (Button) findViewById(R.id.B11);
        Button b12 = (Button) findViewById(R.id.D);
        RadioGroup r = (RadioGroup) findViewById(R.id.R);
        RadioGroup r1 = (RadioGroup) findViewById(R.id.R1);
        EditText e = (EditText) findViewById(R.id.E1);


        r.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()

        {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.sound) {
                    Toast.makeText(getApplicationContext(), "choice: Self",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "choice: Other Guest",
                            Toast.LENGTH_SHORT).show();
                }
            }

        });



        r1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                if (null != rb && checkedId > -1) {
                    Toast.makeText(RestRegi.this, rb.getText(), Toast.LENGTH_SHORT).show();
                }

            }
        });




        b10.setOnClickListener(new View.OnClickListener()

        {

            public void onClick(View V) {


            }
        });

        b11.setOnClickListener(new View.OnClickListener()

        {

            public void onClick(View V) {


            }
        });
        b12.setOnClickListener(new View.OnClickListener()

        {

            public void onClick(View V) {



            }
        });


    }
}





