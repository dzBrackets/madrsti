package com.example.madrsti;


import java.util.Arrays;

public class data {
    public int type;
  public String  question=null;
  public String[] responds;
  public int path;
  public int correctAnswer=-1;
  public String optionalQst=null;


    public void fillType1(String Question,String[] Responds,int CorrectAnswer){
        type=1;
        question=Question;responds=Responds;correctAnswer=CorrectAnswer;
    }

    public void fillType2(int Path,String [] Responds,int CorrectAnswer){
        type=2;
        ;responds=Responds;correctAnswer=CorrectAnswer;path=Path;
    }


    public void fillType1(String Question,String[] Responds,int CorrectAnswer,String opt){
        optionalQst=opt;
        type=1;
        question=Question;responds=Responds;correctAnswer=CorrectAnswer;
    }

    public void fillType2(int Path,String [] Responds,int CorrectAnswer,String opt){
        optionalQst=opt;
        type=2;
        responds=Responds;correctAnswer=CorrectAnswer;path=Path;
    }

    @androidx.annotation.NonNull
    public String toString()
    {
        return "data [type="
                + type
                + ", question="
                + question
                + ", responds="
                + Arrays.toString(responds)
                +", correctAnswer="
                + correctAnswer
                +", path="
                + path+ "]";
    }


















public data(){}



    /////////////////
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getResponds() {
        return responds;
    }

    public void setResponds(String[] responds) {
        this.responds = responds;
    }

    public int getPath() {
        return path;
    }

    public void setPath(int path) {
        this.path = path;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
