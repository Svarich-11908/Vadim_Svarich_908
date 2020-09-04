package com.company;

public class Student {
    String name;
    int age;
    int course;

    public Student(String name, int age, int course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    int getCourse(){
        return course;
    }
}