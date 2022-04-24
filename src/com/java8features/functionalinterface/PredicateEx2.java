package com.java8features.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employee {
    String name;
    double salary;
    Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
    }
    public String toString(){
        return name+":"+salary;
    }
}

public class PredicateEx2 {
    public static void main(String []args){
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("Anju",5000));
        employeeList.add(new Employee("Anjali",3000));
        employeeList.add(new Employee("Abhi",9000));
        employeeList.add(new Employee("Ankit",6000));

        Predicate<Employee> p = employee -> employee.salary>3000;
        for(Employee e : employeeList){
            if(p.test(e)){
                System.out.println(e);
            }
        }
    }
}
