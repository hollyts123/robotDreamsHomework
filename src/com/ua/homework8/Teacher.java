package com.ua.homework8;

public class Teacher {
    public String name;
    public String subject;
    int lessonsPerDay;
    public void startLesson() {
        System.out.println("Let's get started our " + subject.toLowerCase() + " class!");
    }
    public void gradeStudentAssignments() {
        System.out.println("Your " + subject.toLowerCase() + " assignment was graded!\n");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", lessonsPerDay=" + lessonsPerDay +
                '}';
    }
}
