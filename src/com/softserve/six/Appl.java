package com.softserve.six;

import java.util.*;

public class Appl {
    public static void main(String[] args) {
        List<Student> listSt = new ArrayList<>();
        listSt.add(new Student("Vasja", 2));
        listSt.add(new Student("Kolya", 1));
        listSt.add(new Student("Olya", 1));
        listSt.add(new Student("Vasya", 3));
        listSt.add(new Student("Petya", 3));
        listSt.add(new Student("Oleg", 1));
        Student st1 = new Student();
        st1.printStudents(listSt, 3);
        System.out.println("");
//        Comparator<Student> scomp = StudentNameComparator(listSt);
//        List<Student> list1 = new Arrays(listSt);
        for (Student st : listSt) System.out.println(st);
//        listSt.sort((a,b)->a.compareTo(b));
//        Arrays.sort(listSt);
//        Collections.<Student>sort(listSt);
        
        System.out.println("");
        for (Student st : listSt) System.out.println(st);
    }
}
