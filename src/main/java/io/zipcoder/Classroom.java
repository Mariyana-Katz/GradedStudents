package io.zipcoder;

import java.util.ArrayList;
import java.util.Map;

public class Classroom {
    ArrayList<Student> students = new ArrayList<>();
    int maxNumberOfStudents;

    public Classroom(){

    }

    public Classroom(ArrayList<Student> students){
        this.students = students;

    }

    public Classroom(int maxNumberOfStudents){
        this.maxNumberOfStudents = maxNumberOfStudents;
    }


    public ArrayList<Student> getStudents() {
        return students;
    }


    //returns the sum of all exam averages divided by the number of students.
    public Double getAverageExamScore(){

    return  getAverageExamScore()/30;

    }



   // Define a method which uses a Student parameter to add a Student object to the composite students list.
    public void addStudent(Student student){
        this.students.add(student);


    }
//    Define method removeStudent(String firstName, String lastName)
//    The class Classroom should define a method which uses a firstName and lastName parameter to identify and remove the respective student from composite students object.
//    Ensure the array is re-ordered after the removal; Null values should be located in the final indices of the array.
    public void removeStudent(String firstName, String lastName) {
        students.remove(students);
    }



//    Define method getStudentsByScore()
//    The class Classroom should define a method getStudentsByScore() which returns an array representation of Student objects sorted in descending order by score.
//    If two students have the same class average, order them lexigraphically.

    public ArrayList<Student> getStudentsByScore(){
        return null;
    }

//    Define method getGradeBook()
//    The class Classroom should define a method getGradeBook() which returns a mapping of Student objects to a respective letter grade determined by creating a grading curve such that
//    An A is awarded to students whose class average is in the upper 10th percentile.
//    A B is awarded to students whose class average falls between the upper 11th and 29th percentile.
//    A C is awarded to students whose class average falls between the upper 30th and 50th percentile.
//    A D is awarded to students whose class average falls between the lower 51st and 89th percentile.
  //  An F is awarded to students whose class average is in the lower 11th percentile.

    public Map<Student, Character> getGradeBook(){
        return null;
    }

}
