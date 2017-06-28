package com.example.suraj.orhv;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
//import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

/**
 * Created by Suraj on 6/24/2017.
 */

public class RestRegi extends AppCompatActivity {
    Button btnDatePicker, btnTimePicker;
    EditText txtDate, txtTime;
    private int mYear, mMonth, mDay, mHour, mMinute;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resthouse_regpage);


        Button b10 = (Button) findViewById(R.id.B10);
        Button b11 = (Button) findViewById(R.id.B11);
        RadioGroup r = (RadioGroup) findViewById(R.id.R);
        EditText e = (EditText) findViewById(R.id.E1);
        btnDatePicker = (Button) findViewById(R.id.X);
        btnTimePicker = (Button) findViewById(R.id.Y);
        txtDate = (EditText) findViewById(R.id.in_date);
        txtTime = (EditText) findViewById(R.id.D1);


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


    }
}





