package com.example.myapplication;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.accessibility.AccessibilityViewCommand;

import android.content.Intent;
import android.icu.text.CaseMap;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public EditText ed;
    public TextView tv;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EditText getEd() {
        return ed;
    }

    public void setEd(EditText ed) {
        this.ed = ed;
    }


    public void setTv(TextView tv) {
        this.tv = tv;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  ed = findViewById(R.id.ED);
        tv = findViewById(R.id.Tv1);
        switch ("data"){
            case "Hello":
          //      findViewById(R.id.tv);


                break;

        }
    }

    public void clicked(View view) {
        name = ed.getText().toString();
        tv.setText(name);
    }

    public void click(View view) {
        Intent intent = new Intent(this, swipe.class);
        startActivity(intent);

    }


}