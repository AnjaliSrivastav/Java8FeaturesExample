package com.java8features.functionalinterface.predefinedfunctionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

class Employee{
    int eno;
    String name;
    Employee(int eno,String name){
        this.name = name;
        this.eno=eno;
    }

    public String toString(){
        return name+":"+eno;
    }
}
public class BiFunctionEx {
    public static void main(String []args){
        //BiFunction to create an Employee
        BiFunction<Integer,String,Employee> biFunction = (employeeNo,employeeName)-> new Employee(employeeNo,employeeName);
        Employee e1 = biFunction.apply(101,"Anjali");
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(biFunction.apply(201,"Ankit"));
        employeeList.add(biFunction.apply(201,"Anju"));
        employeeList.add(biFunction.apply(201,"Abhi"));

        for(Employee e: employeeList){
   System.out.println(e);
        }
    }

}
