package io.zipcoder;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Student {


    private String firstName;
    public String lastname;

    public ArrayList<Double> examScores;

    public Student(String firstName, String lastname, Double [] testScores) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.examScores = new ArrayList<>(List.of(testScores));
    }

   // Double[] representative of a collection of testScores


//    Getters and Setters
//    Define a getter and setter for each of the instance variables declared in the Student class.
//    Note: There should not be a setter for the testScore. This object's state will be mutated via a takeExam method mentioned below.
//    Additionally, define a getter, getNumberOfExamsTaken(), which returns the total number of exams taken by this student.

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }



    public String getExamScore() {
    String output = "";
    for(int i = 0; i<examScores.size(); i++){
       output += "Exam " + (i+1) + " -> " + examScores.get(i) + "\n";
    }
    return output;
    }

    public void addExamScore(double examScore) {
        examScores.add(examScore);
    }




    public void setExamScore(int examNumber, double newScore){
        examScores.set(examNumber , newScore);
    }

    public Double getAverageExamScore(){
        double sum = 0;
        for(int i=0; i<examScores.size(); i++){
            sum = sum+ examScores.get(i);
        }
      double  result =  sum/examScores.size();
        return result;
    }

    public String toString(){
       return  this.firstName + " " + this.lastname  + "\n" + getAverageExamScore() + "\n" + getExamScore();
    }

}
