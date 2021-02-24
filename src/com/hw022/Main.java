package com.hw022;

public class Main {

    public static void main(String[] args) {

        Person n1 = new Person();
        n1.input();

        Person n2 = new Person("Vovochka", "Ivanov");
        Person n3 = new Person("Vovka", "Dyrak");
        Person n4 = new Person();
        Person n5 = new Person();

        n1.print();
        n2.print();
        n3.print();
        n4.print();
        n5.print();

    }
}

