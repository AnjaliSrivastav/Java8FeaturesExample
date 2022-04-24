package com.java8features.functionalinterface.predefinedfunctionalinterface;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateEx1 {
    public static void main(String []args){
        Predicate<Integer> p  = i-> i%2 == 0;
        System.out.println(p.test(5690));
        System.out.println(p.test(43));

        String []nameArray = {"Anju","Abhi","Ankit","Anjali"};
        Predicate<String> ps = ss->ss.length()>5;
        //print the string whose length is greater than 5
        for(String name : nameArray){
            if(ps.test(name)){
                System.out.println(name);
            }
        }

    }
}
