package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {
@Test
public void nameTest(){
    String firstName = "Leon";
    String lastName = "Hunter";
    Double [] testScores = {100.0};
   // When
    Student student = new Student(firstName, lastName, testScores);

    String expected = "Tom";
    //Then
    student.setFirstName(expected);
    String actual = student.getFirstName();
    Assert.assertEquals(expected, actual);


}
    @Test
    public void nameTest1() {
        // When
        String firstName = "Leon";
        String lastName = "Hunter";
        Double [] testScores = {100.0};


        String expected = "Frederson";
        Student student = new Student(firstName, lastName, testScores);

        //Then
        student.setLastname(expected);
        String actual = student.getLastname();
        Assert.assertEquals(expected, actual);
    }

        @Test
        public void addExamScoreTest(){
            String firstName = "Leon";
            String lastName = "Hunter";
            //ArrayList<Double > examScores = new ArrayList<>();
            Double [] testScores = {};
            Student student = new Student(firstName, lastName, testScores);
            student.addExamScore(100.0);


            String expected = "Exam 1 -> 100.0\n";
            String actual = student.getExamScore();
            Assert.assertEquals(expected, actual);



}
@Test
    public void GetExamScoresTest(){

    String firstName = "Leon";
    String lastName = "Hunter";
    ArrayList<String> examScores = new ArrayList<>();
    Double[] testScores={100.0};
    //examScores.add("100.0");
    Student student = new Student(firstName, lastName, testScores);

// Then
    String expected ="Exam 1 -> 100.0\n";
    String output = student.getExamScore();
    Assert.assertEquals(expected,output);


}
    @Test
    public void getAverageExamScoreTest(){
        String firstName = "Leon";
        String lastName = "Hunter";
        Double [] testScores = {100.0, 200.0, 300.0};
        ArrayList<String> examScores = new ArrayList<>();
        examScores.add("100.0");
        examScores.add("200.0");
        examScores.add("300.0");
        Student student = new Student(firstName, lastName, testScores);

        String actual = String.valueOf(student.getAverageExamScore());
        String expected ="200.0";

        Assert.assertEquals(expected, actual);

    }

    @Test

    public void toStringTest(){
    String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        Double [] testScores = {100.0, 200.0};
        examScores.add(100.0);
        examScores.add(200.0);
        Student student = new Student(firstName, lastName, testScores);

        String expected = firstName + " " +  lastName + "\n" + (100.0 + 200.0)/2 + "\n" +  "Exam 1 -> " + examScores.get(0) +  "\n" +  "Exam 2 -> " + examScores.get(1)  + "\n";
        String actual = student.toString();

        Assert.assertEquals(expected, actual);

    }




}