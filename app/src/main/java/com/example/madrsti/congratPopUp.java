package com.example.madrsti;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class congratPopUp extends AppCompatActivity {
TextView back,replay;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.congrat_pop);
back=findViewById(R.id.back);
replay=findViewById(R.id.replay);
        TextView tx=  (TextView)(findViewById(R.id.congra_score));
        tx.setText(numbers_activity.sharableScore+1+"/10");

initListener();

    }
    void initListener(){
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                congratPopUp.this.finish();
                numbers_activity.self.finish();
            }
        });
        replay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                congratPopUp.this.finish();
                numbers_activity.self.finish();
                Intent i=new Intent(congratPopUp.this,numbers_activity.class);
                startActivity(i);
            }
        });
    }
}
