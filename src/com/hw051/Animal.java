package com.hw051;

public interface Animal {

    default void voice(){
        System.out.println("animal Voice");
        System.out.println("----------------------------");
    }

    default void feed(){
        System.out.println("animal Feed");
    }

}
