package com.java8features.defaultAndStaticmethods;

interface Interf1{
    public static void m1(){
        System.out.println("Interface static method");
    }
}
public class StaticMethodInIterfaceEx implements Interf1 {
    public static void main(String []args){
        Interf1.m1(); //calling static method using interface name
        //m1();  // Not Valid
        //Test.m1();  // Not Valid
        //Test t = new Test();
        // t.m1();  //Not Valid

    }

    // Note: From 1.8 onwards, static methods are allowed inside an interface. Thus main() method is also allowed inside an interface from
    //1.8 version onwards.
}
