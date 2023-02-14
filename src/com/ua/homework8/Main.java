package com.ua.homework8;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Maria";
        student1.age = 19;
        student1.major = "Economics";
        student1.gpa = 4.3;
        System.out.println(student1);
        student1.attendsClasses();
        student1.doesHomework();

        Student student2 = new Student();
        student2.name = "Mark";
        student2.age = 21;
        student2.major = "Computer science";
        student2.gpa = 3.8;
        System.out.println(student2);
        student2.attendsClasses();
        student2.doesHomework();

        Teacher csTeacher = new Teacher();
        csTeacher.name = "Mr. Brown";
        csTeacher.subject = "Computer science";
        csTeacher.lessonsPerDay = 4;
        System.out.println(csTeacher);
        csTeacher.startLesson();
        csTeacher.gradeStudentAssignments();

        Teacher economicsTeacher = new Teacher();
        economicsTeacher.name = "Ms. Smith";
        economicsTeacher.subject = "Economics";
        economicsTeacher.lessonsPerDay = 5;
        System.out.println(economicsTeacher);
        economicsTeacher.startLesson();
        economicsTeacher.gradeStudentAssignments();

        Array array1 = new Array();
        array1.fillArrayWithRandomNumbers();
        array1.sortArrayToLargest();
        array1.sortArrayToSmallest();

        Array array2 = new Array();
        array2.fillArrayWithRandomNumbers();
        array2.sortArrayToLargest();
        array2.sortArrayToSmallest();
    }
}
