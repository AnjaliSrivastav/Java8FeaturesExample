package com.java8features.functionalinterface;

/*Predicate Chaining Methods
* p1.and(p2).test(2)
* p1.negate().test(8)
* */
import java.util.function.Predicate;
public class PredicateJoiningEx {
    public static void main(String []args){
      int []numArray = {0,5,10,15,20,25,30,35};
        Predicate<Integer> p1 = n -> n%2==0;
        Predicate<Integer> p2 = n -> n>10 && n<35;
        System.out.println("The no.s which are even,greater than 10 and less than 35 :");
        for(Integer i : numArray){
            if(p1.and(p2).test(i)){
             System.out.println(i);
            }
        }

        System.out.println("The no.s which are not even");
        for(Integer i : numArray){
            if(p1.negate().test(i)){
                System.out.println(i);
            }
        }
    }
}
