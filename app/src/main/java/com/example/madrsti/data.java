package com.example.madrsti;


import java.util.Arrays;

public class data {
    public int type;
  public String  question=null;
  public String[] responds;
  public String path=null;
  public int correctAnswer=-1;


    public void fillType2(String Path,String [] Responds,int CorrectAnswer){
      type=2;
      ;responds=Responds;correctAnswer=CorrectAnswer;path=Path;
    }
    public void fillType1(String Question,String[] Responds,int CorrectAnswer){
        type=1;
        question=Question;responds=Responds;correctAnswer=CorrectAnswer;
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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
