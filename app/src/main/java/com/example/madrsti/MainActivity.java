package com.example.madrsti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Numbersbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Numbersbutton = (Button)findViewById(R.id.numbers_button);
        numberbuttinclicked();
    }

    public void numberbuttinclicked(){
        Numbersbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,numbers_activity.class);
                startActivity(i);
            }
        });

    }

}
