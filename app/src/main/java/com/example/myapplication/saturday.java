package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class saturday extends AppCompatActivity {
    String day;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saturday);
        Bundle bundle = getIntent().getExtras();
        day = bundle.getString("Day");
        tv.setText(day);

    }
}