package com.example.coloractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] items = new String[] {"Choose a color", "Red", "Blue", "Green", "Black", "White", "Gray","Cyan", "Magneta","Yellow", "Light Gray"};
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter((adapter));

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String item = parent.getItemAtPosition(position).toString();
        RelativeLayout myLayout = findViewById(R.id.myLayout);


        if (item.equals("Red")) {
            myLayout.setBackgroundColor(Color.RED);
            view.setBackgroundColor(Color.WHITE);
        }
        else if(item.equals("Blue")) {
            myLayout.setBackgroundColor(Color.BLUE);
            view.setBackgroundColor(Color.WHITE);
        }
        else if(item.equals("Green")) {
            myLayout.setBackgroundColor(Color.GREEN);
            view.setBackgroundColor(Color.WHITE);
        }
        else if(item.equals("Black")) {
            myLayout.setBackgroundColor(Color.BLACK);
            view.setBackgroundColor(Color.WHITE);
        }
        else if(item.equals("White")) {
            myLayout.setBackgroundColor(Color.WHITE);
            view.setBackgroundColor(Color.WHITE);
        }
        else if(item.equals("Gray")) {
            myLayout.setBackgroundColor(Color.GRAY);
            view.setBackgroundColor(Color.WHITE);
        }
        else if(item.equals("Cyan")) {
            myLayout.setBackgroundColor(Color.CYAN);
            view.setBackgroundColor(Color.WHITE);
        }
        else if(item.equals("Magenta")) {
            myLayout.setBackgroundColor(Color.MAGENTA);
            view.setBackgroundColor(Color.WHITE);
        }
        else if(item.equals("Yellow")) {
            myLayout.setBackgroundColor(Color.YELLOW);
            view.setBackgroundColor(Color.WHITE);
        }
        else if(item.equals("Light Gray")) {
            myLayout.setBackgroundColor(Color.LTGRAY);
            view.setBackgroundColor(Color.WHITE);
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}