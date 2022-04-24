package com.java8features.lambdaexpression;

public class ThreadUsingInnerClass {
    public static void  main(String []args){
        Runnable r =  new Runnable() { //implementation class of Runnable interface(anonymous inner class)
            @Override
            public void run() {
                for(int i=0;i<5;i++){
                   System.out.println("Child Thread-1");
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
        for(int i=0;i<5;i++){
            System.out.println("Main Thread-1");
        }
    }

    //Note: Out pf Anonymous Inner Class(AIC) and LambdaExpression, we can't use LambdaExpression in place of (AIC) all the time ,
    // But we can (AIC) in place of LambdaExpression all the time. Thus AIC is a more powerful concept as compared to LambdaExpression
}
