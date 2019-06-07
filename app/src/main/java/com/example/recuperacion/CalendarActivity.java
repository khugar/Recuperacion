package com.example.recuperacion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

public class CalendarActivity extends AppCompatActivity {

    private static final String TAG = "CalendarActivity";

    TextView fecha;
    CalendarView calendario;
    Button btnVolver;

    @Override
    protected void onCreate( Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar_layout);
        calendario = (CalendarView) findViewById(R.id.calendarView);
        fecha = (TextView) findViewById(R.id.tvFecha);
        btnVolver = (Button) findViewById(R.id.btnVolver);

        btnVolver.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalendarActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });

        calendario.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                String date = dayOfMonth + "/" + month + "/" + year;
                fecha.setText(date);

            }
        });

    }
}
