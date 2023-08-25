package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public EditText ed;
    public TextView tv;
    String Day;


    public EditText getEd() {
        return ed;
    }

    public void setTv(TextView tv) {
        this.tv = tv;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.Tv1);
        ed = findViewById(R.id.ED);
        Intent intent=new Intent(this,  saturday.class);
        startActivity(intent);
        click(intent);

        switch ("Day") {

            case ("saturday"):
                Day = "1";
                break;
            case ("sunday"):
                Day = "2";
                break;
            case ("mondday"):
                Day = "3";
                break;
            case ("tuseday"):
                Day = "4";
                break;
            case ("wedensday"):
                Day = "5";
                break;
            case ("tursday"):
                Day = "6";
                break;
            case ("friday"):
                Day = "7";
                break;
        }
    }

    public void click(Intent intent2) {
        findViewById(R.id.BTN);
        tv.setText(Day);
        ed.setText(Day);
    }
    public void week() {
        Intent intent = new Intent(this, swipe.class);
        startActivity(intent);
        intent.getExtras();
    }
}