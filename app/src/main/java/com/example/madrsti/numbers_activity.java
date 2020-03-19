package com.example.madrsti;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class numbers_activity extends AppCompatActivity {

    static String DEFAULT_HOW_ANS="اختر الاجابة الصحيحة";

    //Module name
    String module=MainActivity.module;
ConstraintLayout respType1;
ConstraintLayout respType2;
ConstraintLayout bigQCont;
int theCurrentAnswerIndex=-1;
ImageView imgQst;
    ImageView lvlDots[]=new ImageView[10];

int localScore=0;

TextView    modType,
            question,
            how_ans,
            t1button1,
        t1button2,
        t1button3,
        t1button4,
        t2button1,
        t2button2,
        t2button3,
        t2button4,
        lvlNum,
        txtQCont;

TextView button1,button2,button3,button4;

    ;

    data[] filData;
    int currentStage=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_activity);


        initInstances();


        filData=new data[10];


//FilData=[{Type:A,question:"1+1",resp:[2,3,1,4],imgPath:null},...,{Type:A,question:"1+1",resp:[2,3,1,4],imgPath:null}]
        for(int i = 0; i<filData.length; i++)
            filData[i]=new data();

        filData[0].fillType1("1+1 ", new String[]{"1","8","2","5"},2);
        filData[1].fillType1("1+1 ", new String[]{"1","8","2","5"},2);
        filData[2].fillType1(" كم عدد زوايا المثلث", new String[]{"180","8","2","5"},2);
        filData[3].fillType1("1+1 ", new String[]{"1","8","2","5"},2);
        filData[4].fillType2("bird", new String[]{"عينان","عينون","عيون","عين"},2,"كم عدد اعين هذا المخلوق");
        filData[5].fillType1("شحال دير البطاطا ", new String[]{"150دج","8دج","2دج","5دج"},2,"بالكيلو غرام يا احمق");
        filData[6].fillType1("سؤال اخر ", new String[]{"1","8","2","5"},2);
        filData[7].fillType1("سؤال ما ", new String[]{"3","8","2","5"},2);
        filData[8].fillType1("1+1 ", new String[]{"8","8","2","5"},2);
        filData[9].fillType1("1+1 ", new String[]{"4","8","2","1"},2);


        renderStage();
    }
void initInstances(){
    respType1=findViewById(R.id.responds_container1);
    respType2=findViewById(R.id.responds_container2);
    bigQCont=findViewById(R.id.picture_container);
    imgQst=findViewById(R.id.animal_img);

    modType=(TextView) findViewById(R.id.mod_type);
    how_ans=(TextView) findViewById(R.id.choosen_answer_tv);
    t1button1=(TextView) findViewById(R.id.t1button_ch1);
    t1button2=(TextView) findViewById(R.id.t1button_ch2);
    t1button3=(TextView) findViewById(R.id.t1button_ch3);
    t1button4=(TextView) findViewById(R.id.t1button_ch4);
    t2button1=(TextView) findViewById(R.id.t2button_ch1);
    t2button2=(TextView) findViewById(R.id.t2button_ch2);
    t2button3=(TextView) findViewById(R.id.t2button_ch3);
    t2button4=(TextView) findViewById(R.id.t2button_ch4);
    lvlNum=findViewById(R.id.qst_number_tv);
    txtQCont=findViewById(R.id.qst_container_tv);
    lvlDots[0]=findViewById(R.id.dot1);
    lvlDots[1]=findViewById(R.id.dot2);
    lvlDots[2]=findViewById(R.id.dot3);
    lvlDots[3]=findViewById(R.id.dot4);
    lvlDots[4]=findViewById(R.id.dot5);
    lvlDots[5]=findViewById(R.id.dot6);
    lvlDots[6]=findViewById(R.id.dot7);
    lvlDots[7]=findViewById(R.id.dot8);
    lvlDots[8]=findViewById(R.id.dot9);
    lvlDots[9]=findViewById(R.id.dot10);
    }

    void setQstLayout(int type){

     //text with horizentail resp
        if (type==1){
            //Hide type2
            respType2.setVisibility(View.GONE);
            bigQCont.setVisibility(View.GONE);
            //show type 1
            respType1.setVisibility(View.VISIBLE);
            txtQCont.setVisibility(View.VISIBLE);
            //setRespButton
            button1=t1button1;
            button2=t1button2;
            button3=t1button3;
            button4=t1button4;
        }
        //image with table
        if(type==2){
            //show type2
            respType2.setVisibility(View.VISIBLE);
            bigQCont.setVisibility(View.VISIBLE);
            //hid type 2
            respType1.setVisibility(View.GONE);
            txtQCont.setVisibility(View.GONE);
            //setRespButton

            button1=t2button2;
            button2=t2button1;
            button3=t2button4;
            button4=t2button3;

        }
    }

void renderStage(){
        data q=filData[currentStage];
    modType.setText(module);
        setQstLayout(q.type);


        //optional qustion/remark
        if(q.optionalQst!=null){
            how_ans.setText(q.optionalQst);
        }
        else
            how_ans.setText(DEFAULT_HOW_ANS);


        if (q.type==1)
            txtQCont.setText(q.question);
    //    if (q.type==2)
//imgQst.setImageIcon(q.path);

        button1.setText(q.responds[0]);
        button2.setText(q.responds[1]);
        button3.setText(q.responds[2]);
        button4.setText(q.responds[3]);

    setRespListener();
}
void checkAnswer(){
    if(filData[currentStage].correctAnswer==theCurrentAnswerIndex){
        yoCorrect();
    }
    else
        yofool();
    nextStage();
}
void exit(){
        numbers_activity.this.finish();
}

void nextStage(){

        currentStage=(currentStage+1);

    if (currentStage<10){
    lvlNum.setText(currentStage+1+"/10");
        renderStage();
        dynamicProgress("");
    }

    if(currentStage>filData.length-1)
            gameOver();
}


void gameOver(){
MainActivity.updateScore(localScore);
numbers_activity.this.finish();
}
void setRespListener(){
    button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View l) {
            theCurrentAnswerIndex=1;
            checkAnswer();

        }
    });

    button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View l) {
            theCurrentAnswerIndex=2;
            checkAnswer();

        }
    });
    button3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View l) {
            theCurrentAnswerIndex=3;    checkAnswer();

        }
    });
    button4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View l) {
            theCurrentAnswerIndex=4;
            checkAnswer();

        }
    });
    }
void dynamicProgress(String condition){
    lvlDots[currentStage].setImageResource(R.drawable.currentdot_lvl);

}

void yoCorrect(){
    lvlDots[currentStage].setImageResource(R.drawable.correctdot_lvl);
    localScore++;
}
void yofool(){
    lvlDots[currentStage].setImageResource(R.drawable.wrong_lvl);
    }
}
