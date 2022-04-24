package com.java8features.defaultAndStaticmethods;

interface Left {
    default void m1(){
        System.out.println("Left interface default method");
    }
}

interface Right {
    default void m1(){
        System.out.println("Right interface default method");
    }
}

public class DefaultMethodEx2 implements Left,Right{
    //Override the default method
    public void m1(){
        System.out.println("Our own m1 method");
        Left.super.m1(); //to print Left interface m1()
        Right.super.m1(); //to print Right interface m1()

    }

    public static void main(String []args){
        DefaultMethodEx2 df = new DefaultMethodEx2();
        df.m1();
    }


}
