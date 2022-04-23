package com.java8features.lambdaexpression;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ex1 {


    public static void main(String []args){
        //lambdaexpression to find if the given input is even number or not
       Predicate<Integer> p = i->i%2==0;
        System.out.println(p.test(9));
        System.out.println(p.test(20));

        //lambdaexpression to get square of a number
        Function<Integer,Integer> function= i->i*i;
        // or we can write the same Function using return keyword(then, compulsory, weshould put brackets)
        Function<Integer,Integer> functionUsingReturn= i->{ return i*i;};
        System.out.println("Square  is :"+function.apply(9));
        System.out.println("Square  is :"+functionUsingReturn.apply(6));

        //lambdaexpression to add two numbers given in i/p
        BiConsumer<Integer,Integer> biConsumer = (a, b)-> System.out.println("Sum of Two numbers is :"+(a+b));
        biConsumer.accept(10,5);






    }
}
