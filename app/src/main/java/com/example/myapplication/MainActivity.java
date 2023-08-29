package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    //edit value
    public EditText ed;
    public TextView tv;

    String name;
    //TODO CHERA ???
    ////TODO CHERA ???

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO CHERA ???
        //TODO Chera ???
        tv = findViewById(R.id.Tv1);
        ed = findViewById(R.id.ED);

    }
    public void click(View view) {
       name= ed.getText().toString();

        int integerDay = Integer.parseInt(name);
        switch (integerDay) {
            case 1:
                name= "شنبه";
                break;
            case 2:
                name = "یک شنبه";
                break;
            case 3:
                name = "دو شنبه";
                break;
            case 4:
                name = "سه شنبه";
                break;
            case 5:
                name = "چهار شنبه";
                break;
            case 6:
                name = "پنج شنبه";
                break;
            case 7:
                name = "جمعه";
                break;
        }
        Intent intent=new Intent();
        nextActivity(name);
    }

    private void nextActivity(String name) {
        Intent intent = new Intent(MainActivity.this, saturday.class);
        intent.putExtra("Day", name);
        startActivity(intent);
    }

    //TODO to activity nextAct Bundle dorost kon baad rooz ro begir va to text view oon activity neshoonesh bedeh.

    //TODO CHERA ???
}