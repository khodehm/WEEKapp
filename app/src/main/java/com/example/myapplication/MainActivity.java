package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public EditText ed;
    public TextView tv;
    String Day;
    //TODO CHERA ???
    //int [] day = { 1 , 2, 3 ,4 ,5 ,6 , 7};
    ////TODO CHERA ???
    //public int[]week = new int[7];
    /*

    create new proj
    copy all xmls
    array list for days
    just two classes for Sat Sun
    set intent



     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.Tv1);
        ed = findViewById(R.id.ED);
        //TODO CHERA ???
        //Intent main=new Intent(this,MainActivity.class);
        //startActivity(main);
//TODO Chera ???
/*
    switch ([] day) {

            case 1:

                    break;
            }
            case 2:
                Intent intent1 = new Intent(this, sunday.class);
                startActivity(intent1);
                break;
            case 3:
                Intent intent2 = new Intent(this, monday.class);
                startActivity(intent2);
        }
*/

    }
    
    public void click(View view) {
        findViewById(R.id.BTN);
        int integerDay = Integer.parseInt(Day);
        String naam ;
        switch(integerDay){
            case 1:
                naam  = "شنبه" ;
            break;
            case 2:
                naam  = "یک شنبه" ;
            break;
            case 3:
                naam  = "دو شنبه" ;
            break;
            case 4:
                naam  = "سه شنبه" ;
            break;
            case 5:
                naam  = "چهار شنبه" ;
            break;
            case 6:
                naam  = "پنج شنبه" ;
            break;
            case 7:
                naam  = "جمعه" ;
            break;
        }
        nextActivity(naam);
    }
    private void nextActivity(String name){
        Intent intent = new Intent (MainActivity.this,nextAct.class):
        intent.putExtra("rooz",name);
        startActivity(intent);
    }

    //TODO to activity nextAct Bundle dorost kon baad rooz ro begir va to text view oon activity neshoonesh bedeh.

    //TODO CHERA ???
    /*public  void intent_days(int [] day ) {

    if( day[0] == 1 ) {
        Intent intent = new Intent(this, saturday.class);
        startActivity(intent);
    }
}*/

}
