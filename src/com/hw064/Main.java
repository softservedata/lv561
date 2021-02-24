package com.hw064;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {



        Student Max = new Student("Max", 1);
        Student Vovka = new Student("Vovka", 5);
        Student Sanya = new Student("Sanya", 4);
        Student Arsen = new Student("Arsen", 2);
        Student Bodya = new Student("Bodya", 3);

        Student[] arr = {Max, Vovka, Sanya, Arsen, Bodya};

        System.out.print(Arrays.toString(arr));

        List<Student> lst = Arrays.asList(Max, Vovka, Sanya, Arsen, Bodya);
        System.out.print(lst);

        System.out.print("AAAAA" + lst.subList(1, 1));

    }
}
