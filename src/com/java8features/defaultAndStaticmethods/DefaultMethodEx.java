package com.java8features.defaultAndStaticmethods;


interface Interf{
    default void m1(){
        System.out.println("Dummy Implementation of default method");
    }

    //Note: Object class methods can't be defined as default methods inside an interface. It is not required.It will through an error.
    /*default int hashCode(){
        return 10;
    }*/

}
public class DefaultMethodEx implements Interf{
    public void m1(){
        System.out.println("Overriding default method of interface Interf");
    }
    public static void main(String []args){
        //Overriding default method of Interf(I), it should be declare as public bcz default methods can't be declared inside the class.
        //Inside the class , it has another meaning(like in switch statement, it is a default case)
        DefaultMethodEx df = new DefaultMethodEx();
        df.m1();
    }
}
