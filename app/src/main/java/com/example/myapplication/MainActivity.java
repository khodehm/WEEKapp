package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public EditText ed;
    public TextView sa;
    String Day;
    Button Clk;
    public EditText getEd() {
        return ed;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sa = findViewById(R.id.Tv1);
        ed = findViewById(R.id.ED);

        Intent S = new Intent(this, saturday.class);
        S.putExtra("day one of week ",1);
        Intent Su = new Intent(this, sunday.class);
        switch ("Day") {
            case ("saturday"):
                if (Day == "1") {
                    startActivity(S);
                }
                    break;
            case ("sunday"):
                if (Day == "2") {
                    startActivity(Su);
                }
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

    public void click(View view) {
        findViewById(R.id.BTN);
       Day= ed.getText().toString();

    }

    public void week() {
        Intent intent = new Intent(this, saturday.class);
        startActivity(intent);
        intent.getExtras();
    }
}