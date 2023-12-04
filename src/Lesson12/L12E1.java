package Lesson12;

import Lesson12.StudentA;

public class L12E1 {
    public static void displayStudent(StudentA thisStudent){
        System.out.format("(%d) %s %s %n",thisStudent.id, thisStudent.firstName, thisStudent.surname);
    }
    public static void main(String[] args) {
        // create student object and display
        StudentA student1 = new StudentA(1, "Amanda", "Wallis", false);
        System.out.println(student1.present);
        displayStudent(student1);
        // update values of student object and display
        student1.present = true;
        System.out.println(student1.present);
    }
}