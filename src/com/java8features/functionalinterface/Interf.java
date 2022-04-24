package com.java8features.functionalinterface;

/*Using the @FunctionalInterface is optional. It's advantage is compiler will give error if by mistake the interface do not satisfies
the FI properties*/
@FunctionalInterface
public interface Interf {
    public void m1();
    /*FI can have any no of default and static methods but only one abstract method*/
    default void m2(){

    }

    default  void m3(){

    }

    public static void m4(){

    }

}
