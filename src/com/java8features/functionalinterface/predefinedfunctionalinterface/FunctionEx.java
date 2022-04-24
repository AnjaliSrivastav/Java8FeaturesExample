package com.java8features.functionalinterface.predefinedfunctionalinterface;

import java.util.function.Function;

public class FunctionEx {
    public static void main(String []args){
        //Function to find square Root of a no.
        Function<Integer,Integer> f1 = i -> i*i;
        System.out.println(f1.apply(5));
        System.out.println(f1.apply(15));

        //Function to find length Root of a given String
        Function<String,Integer> f2 = s -> s.length();
        System.out.println(f2.apply("Krishna"));
        System.out.println(f2.apply("Madhav"));

        //Function to covert the given String to upperCase
        Function<String,String> f3 = s -> s.toUpperCase();
        System.out.println(f3.apply("gopal"));


    }
}
