package com.java8features.functionalinterface.predefinedfunctionalinterface;

import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerEx {
    public static void main(String []args){
        //Consumer c print the String given in input
        Consumer<String> c = s-> System.out.println(s);
           c.accept("Be Persistent till you become independent");

        Function<Student,String> f = student -> {
            int marks = student.marks;
            String grade="";
            if(marks>=80) grade="A";
            else if(marks>=70) grade="B";
            else if(marks>=60) grade="C";
            else if(marks>=50) grade="D";
            else if(marks>=40) grade="E";
            else grade="E[Failed]";
            return grade;
        };

        Student []students = {new Student("Anbu",90), new Student("Nishant",85), new Student("Ashok",60), new Student("Sandeep",70)};


        Consumer<Student> studentConsumer = s-> System.out.println(s+" and Grade is :"+f.apply(s));

        /*for(Student){

        }*/
    }
}
