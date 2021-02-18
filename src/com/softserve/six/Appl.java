package com.softserve.six;

import java.util.*;

public class Appl {
    public static void main(String[] args) {
        List<Student> listSt = new ArrayList<>();
        listSt.add(new Student("Vasja", 3));
        listSt.add(new Student("Kolya", 1));
        listSt.add(new Student("Olya", 2));
        listSt.add(new Student("Vasya", 1));
        listSt.add(new Student("Petya", 3));
        listSt.add(new Student("Oleg", 1));
        listSt.add(new Student("Pol", 2));
        listSt.add(new Student("Mol", 3));
        listSt.add(new Student("Jo", 2));
        listSt.add(new Student("Ho", 3));
        listSt.add(new Student("No", 1));
        listSt.add(new Student("Wo", 2));
        listSt.add(new Student("Qo", 1));
        listSt.add(new Student("Ao", 3));
        listSt.add(new Student("To", 2));
        Student st1 = new Student();
        st1.printStudents(listSt, 3);
        System.out.println("");
//
        System.out.println("");
        Collections.sort(listSt);
        for (Student st : listSt) System.out.println(st);
        System.out.println("");
        Collections.sort(listSt, new Student.ByCours());
        for (Student st : listSt) System.out.println(st);
    }
}
