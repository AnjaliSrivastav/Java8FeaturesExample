package com.java8features.functionalinterface;

interface InterfSquare{
    public int squareIt(int n);
}
public class InterfImplementation {
    public static void main(String []args){
        Interf i = new Demo();
        i.m1();

        /*implementing the FIN(Interf) using lambda Expression*/
        Interf fi= ()->System.out.println("Implementing Interf Using Lambda Expression");
          fi.m1();
        InterfSquare iSquare = n -> n*n;
        System.out.println("Square of given no. is : "+iSquare.squareIt(5));

    }

}

/*implementing the FIN(Interf) using a class*/
class Demo implements Interf{
    public  void m1(){
        System.out.println("Implementing Interf Using separate class");
    }
}

