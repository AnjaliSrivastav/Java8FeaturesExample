package com.java8features.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee {
    String name;
    int eno;
    Employee(String name,int eno){
        this.name = name;
        this.eno = eno;
    }
    public String toString(){
        return name+":"+eno;
    }
}
public class EmployeeSortEx {
    public static void main(String []args){
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("Anju",121));
        employeeList.add(new Employee("Anjali",345));
        employeeList.add(new Employee("Neha",675));
        employeeList.add(new Employee("Shivali",234));
        employeeList.add(new Employee("Kanchan",232));
        employeeList.add(new Employee("Priya",564));

        //Sort employees a/q to their eno(in increasing order)
        //Comparator c =(e1,e2) -> (e1<e2)?-1:(e1>e2)?1:0;
        Collections.sort(employeeList,(e1,e2) -> (e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
        System.out.println(employeeList);

        //Sort employees a/q to alphabetical order of their name
        //s1.compareTo(s2) => compareTo() is always applicable to alphabetical order(String)

        Collections.sort(employeeList,(e1,e2)->e1.name.compareTo(e2.name));
        System.out.println(employeeList);

    }
}
