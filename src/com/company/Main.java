package com.company;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Comparator<Student> stdcom = new StudentNameComparator().thenComparing(new StudentAgeComparator()).thenComparing(new StudentCourseComparator());
        TreeSet<Student> student = new TreeSet(stdcom);
        student.add(new Student("Tom", 21,2));
        student.add(new Student("Alex",21,1));
        student.add(new Student("Alex",20,1));
        student.add(new Student("Tom",19,1));

        for(Student s : student){

            System.out.println(s.getName() + " " + s.getAge() + " " + s.getCourse());
        }

    }

    static class StudentNameComparator implements Comparator<Student> {

        public int compare(Student a, Student b){

            return a.getName().compareTo(b.getName());
        }
    }
    static class StudentAgeComparator implements Comparator<Student> {

        public int compare(Student a, Student b) {

            if (a.getAge() > b.getAge())
                return 1;
            else if (a.getAge() < b.getAge())
                return -1;
            else
                return 0;
        }
    }
    static class StudentCourseComparator implements Comparator<Student>{

        public int compare(Student a, Student b){

            if(a.getCourse()> b.getCourse())
                return 1;
            else if(a.getCourse()< b.getCourse())
                return -1;
            else
                return 0;
        }
    }
}