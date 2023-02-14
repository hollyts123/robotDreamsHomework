package com.ua.homework8;

public class Student {
    public String name;
    public int age;
    public String major;
    public double gpa;
    public void attendsClasses() {
        System.out.println(name + " attends " + major + " classes");
    }
    public void doesHomework() {
        System.out.println(name + " does " + major.toLowerCase() + " assignments\n");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", major='" + major + '\'' +
                ", gpa=" + gpa +
                '}';
    }

}
