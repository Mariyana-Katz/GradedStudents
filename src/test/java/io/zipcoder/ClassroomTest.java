package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ClassroomTest {


    @Test
    public void addStudentTest(){
//        String firstName = "Leon";
//        String lastName = "Hunter";
//        Double[]
        Student student2 = new Student("Tom", "Soyer", new Double[]{12.3});
        Student student = new Student("Salvador", "Dali", new Double[]{12.3});
        Student student3 = new Student("Rick", "Riodan", new Double[]{12.3});

        Classroom classroom = new Classroom(2);
        classroom.addStudent(student);
        classroom.addStudent(student2);
        classroom.addStudent(student3);
    int counter = 0;
        for(Student s:classroom.getStudents() ){
            if (s != null) {
                counter++;
            }
        }

//        String expected = "Leon Hunter";
       // int actual = classroom.getStudents();
        Assert.assertEquals(3, counter);
    }
    @Test
    public void removeStudentTest(){
        Student student = new Student("Tom",  "Soyer", new Double[]{18.2});
        Student student1 = new Student( "Salvador", "Dali", new Double[]{16.3});
        Classroom classroom = new Classroom(2);
        classroom.addStudent(student);
        classroom.addStudent(student1);


    }
//    The class Classroom should define a method getStudentsByScore() which returns an array representation of Student objects sorted in descending order by score.
//    If two students have the same class average, order them lexigraphically.
    @Test
    public void getStudentsByScore(){
        Student student = new Student("Tom",  "Soyer", new Double[]{18.2});
        Student student1 = new Student( "Salvador", "Dali", new Double[]{16.3});
        Classroom classroom = new Classroom(2);



    }



}
