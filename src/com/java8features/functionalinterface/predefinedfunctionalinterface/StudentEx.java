package com.java8features.functionalinterface.predefinedfunctionalinterface;

import java.util.function.Function;
import java.util.function.Predicate;

/*Return grade of a Student based on marks*/
class Student{
    String name;
    int marks;
    Student(String name,int marks){
        this.name = name;
        this.marks = marks;
    }

    public String toString(){
        return name+":"+marks;
    }
}
public class StudentEx {
    public static void main(String []args){
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
        for(Student s1:students){
            System.out.println(s1.name+" has grade : "+f.apply(s1));
        }

        //to display only those students whose marks is greater than 60
        Predicate<Student> p = st -> st.marks>=70;
        System.out.println("Students whose marks are greater than 70");
        for(Student s : students){
            if(p.test(s)){
                System.out.println(s);
            }
        }

    }


}
