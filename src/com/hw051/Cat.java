package com.hw051;

public class Cat implements Animal{

    String name;

    public void voice(){
        System.out.print(" and says meow");
        System.out.println("\n----------------------------");
    }
    public void feed(){
        System.out.print(" is hungry");
    }

    Cat(String name){
        this.name = name;
    }
}
