package com.java8features.functionalinterface.predefinedfunctionalinterface;

import java.util.function.Function;

public class FunctionChainingEx {
    public static void main(String []args){
        //Function to find cube of a no.
        Function<Integer,Integer> f2 = i -> i*i*i;
        Function<Integer,Integer> f1 = i -> 2*i;
       System.out.println(f1.andThen(f2).apply(3)); //first f1 then f2
       System.out.println(f2.andThen(f1).apply(2)); //first f2 then f1



    }
}
