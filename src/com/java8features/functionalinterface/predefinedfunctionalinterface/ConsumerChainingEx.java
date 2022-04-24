package com.java8features.functionalinterface.predefinedfunctionalinterface;

import java.util.function.Consumer;

class Movie{
    String name;
    Movie(String name){
        this.name =  name;
    }
}
public class ConsumerChainingEx {
    public static void main(String []args){
        Consumer<Movie> c1 = movie -> System.out.println(movie.name+" ready to release");
        Consumer<Movie> c2 = movie -> System.out.println(movie.name+" released but is bigger flop");
        Consumer<Movie> c3 = movie -> System.out.println(movie.name+" storing in DB");

        Movie m = new Movie("Joker");
        //c1.accept(m);
        //c2.accept(m);
        //c3.accept(m);

        //Chaining of all the 3 Consumers
        Consumer<Movie> cc = c1.andThen(c2).andThen(c3); //first c1,then c2 then c3
           cc.accept(m);
    }
}
