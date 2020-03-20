package com.example.madrsti;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    Button Numbersbutton;
    TextView score;
    static Object dataCollection[];
    static String module=null;
    static int currentScore=0;
    DataBaseHelper db;
//dataCollection [Mod1->array of data,Mod2,Mod3,Mod4]
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadScore();
        initInstances();
        updateLocale();
        Numbersbutton = (Button)findViewById(R.id.numbers_button);
        numberbuttinclicked();
        db=new DataBaseHelper(MainActivity.this);
    }



    @Override
    protected void onDestroy() {
        saveScore();
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        updateLocale();
        super.onResume();
    }

    @Override
    protected void onRestart() {
        saveScore();
        updateLocale();
        super.onRestart();
    }

    void loadScore(){
        try{
            SharedPreferences sharedPref = getSharedPreferences("score", Activity.MODE_PRIVATE);
        currentScore = sharedPref.getInt(getString(R.string.score), 0);}
        catch (Exception e){
            currentScore=0;
        }
    }


void initInstances(){
    score=findViewById(R.id.textView_score);
}

static void updateScore(int newScore){
currentScore+=newScore;
}
void updateLocale(){
    score.setText(""+currentScore);
}
void saveScore(){
    SharedPreferences sharedPref = getSharedPreferences("score", Activity.MODE_PRIVATE);
    SharedPreferences.Editor editor = sharedPref.edit();
    editor.putInt(getString(R.string.score), currentScore);
    editor.apply();
}
void saveToDb(){
    String FILENAME = "data.json";
    String string = "hello world!";

    try {
        FileOutputStream fos = openFileOutput(FILENAME, Context.MODE_PRIVATE);
        fos.write(string.getBytes());
        fos.close();

    } catch (IOException e) {
        e.printStackTrace();
    }



}

    public void numberbuttinclicked(){
        Numbersbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveScore();
                Log.i("info", "onClick: "+currentScore);

                module="رياضيات";

                Intent i=new Intent(MainActivity.this,numbers_activity.class);
                startActivity(i);
            }
        });

    }



}
