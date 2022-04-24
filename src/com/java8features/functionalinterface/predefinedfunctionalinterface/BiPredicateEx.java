package com.java8features.functionalinterface.predefinedfunctionalinterface;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BiPredicateEx {
    public static void main(String []args){
        //BiPredicate to check sum of two numbers is even or not
        BiPredicate<Integer,Integer> biPredicate = (a, b)->(a+b)%2==0;
        System.out.println(biPredicate.test(10,20));
        System.out.println(biPredicate.test(15,20));
    }
}
