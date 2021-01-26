package com.company;

public class Main {

    public static void main(String[] args) {
        int c1 = 1, c2 = 2, c3 =3, t1 = 2, t2 = 4, t3 = 6;

        System.out.println("Дзвінок с1*t1 = " + (c1 * t1));
        System.out.println("Дзвінок с1*t2 = " + (c1 * t2));
        System.out.println("Дзвінок с1*t3 = " + (c1 * t3));
        System.out.println("Усі хвилини = " + (c1 * t1 * t2 * t3));

        System.out.println();

        System.out.println("Дзвінок с2*t1 = " + (c2 * t1));
        System.out.println("Дзвінок с2*t2 = " + (c2 * t2));
        System.out.println("Дзвінок с2*t3 = " + (c2 * t3));
        System.out.println("Усі хвилини =  " + (c2 * t1 * t2 * t3));

        System.out.println();

        System.out.println("Дзвінок с3*t1 = " + (c3 * t1));
        System.out.println("Дзвінок с3*t2 = " + (c3 * t2));
        System.out.println("Дзвінок с3*t3 = " + (c3 * t3));
        System.out.println("Усі хвилини = " + (c3 * t1 * t2 * t3));
    }
}
