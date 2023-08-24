package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class swipe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe);

    }

    public void onclick(View view)
    {
        Intent intent=new Intent(this, swipe.class);
        startActivity(intent);

        findViewById(R.id.BTNswipe);

    }
    public void one (View view){
        Intent i1 = new Intent( this , saturday.class);


    }






}