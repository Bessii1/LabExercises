package com.company.Lab6.Assignment3;

import java.util.Arrays;

public class DriverExam {
    private final String correctAnswers[] = {"B", "D", "A"};
//    , "A", "C", "A", "B", "A", "C", "B", "C", "D",
//            "A", "D", "C", "C", "B", "D", "D", "A"
    public final int size = correctAnswers.length;
    private String studentAnswers[]=new String[size];

    public String getStudentAnswers(int i ) {
        return studentAnswers[i];
    }
    public void setStudentAnswers(int i ,String studentAnswers) {
        this.studentAnswers[i] = studentAnswers;
    }
    public boolean passed(){
        if(totalCorrectAnswers()-totalWrongAnswers()>0){
            return true;
        }
        else{
            return false;
        }
    }
    public int totalCorrectAnswers(){
        int correct = 0;
        for (int i = 0; i < size ; i++) {
            if(correctAnswers[i].equals(studentAnswers[i])){
                correct++;
            }else{
                continue;
            }
        }
        return correct;
    }
    public int totalWrongAnswers(){
        int wrong = 0;
        for (int i = 0; i < size ; i++) {
            if(!correctAnswers[i].equals(studentAnswers[i])){
                wrong++;
            }else{
                continue;
            }
        }
        return wrong;
    }
    public String[] questionMissed(){
        String array[]=new String[Math.abs(totalCorrectAnswers()-totalWrongAnswers())];
        for (int i = 0; i <studentAnswers.length ; i++) {
            if (studentAnswers[i].replaceAll("\\s", "").equals("")){
                array[i] = "Question"+i;
            }
        }
        return array;
    }

    @Override
    public String toString() {
        return "DriverExam{" +
                "correctAnswers=" + Arrays.toString(correctAnswers) +
                ", size=" + size +
                ", studentAnswers=" + Arrays.toString(studentAnswers) +
                '}';
    }
}
