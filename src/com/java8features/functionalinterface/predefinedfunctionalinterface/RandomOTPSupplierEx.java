package com.java8features.functionalinterface.predefinedfunctionalinterface;

import java.util.Date;
import java.util.function.Supplier;

public class RandomOTPSupplierEx {
    public static void main(String []args){
        Supplier<String> s = () -> {
            String otp = "";
            for(int i=0;i<6;i++){
                otp += (int)(Math.random()*10);
            }
            return otp;
        };
        System.out.println(s.get());
    }
}
