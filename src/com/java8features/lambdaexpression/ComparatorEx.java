package com.java8features.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorEx {
    public static void main(String []args){
        List<Integer> l = new ArrayList<Integer>();
        l.add(20);
        l.add(10);
        l.add(25);
        l.add(5);
        l.add(30);
        System.out.println(l);

        System.out.println("Implementing sorting using Implementation Class(MyComparator)");
        Collections.sort(l,new MyComparator());
        //after sorting
        System.out.println(l);

        System.out.println("Implementing FI(Comparator) using lambdaExpression");
        Comparator<Integer> c = (i1,i2)-> (i1<i2)?-1:(i1>i2)?1:0;

        //Implementing sorting using using lambdaExpression
        Collections.sort(l,c);
        System.out.println(l);


    }
}

class MyComparator implements Comparator<Integer> {
    public int compare(Integer i1,Integer i2){
        return (i1<i2)?-1:(i1>i2)?1:0;
    }
}
