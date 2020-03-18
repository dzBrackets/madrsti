package com.example.madrsti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Numbersbutton;
    static Object dataCollection[];
    static String module=null;
//dataCollection [Mod1->array of data,Mod2,Mod3,Mod4]
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Numbersbutton = (Button)findViewById(R.id.numbers_button);
        //dataCollection=loadData();

        numberbuttinclicked();
    }




    public void numberbuttinclicked(){
        Numbersbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                module="رياضيات";
                Intent i=new Intent(MainActivity.this,numbers_activity.class);
                startActivity(i);
            }
        });

    }



}
