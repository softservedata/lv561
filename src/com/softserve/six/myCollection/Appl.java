package com.softserve.six.myCollection;

import java.util.*;

public class Appl {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
        List<Integer> myCollection = new LinkedList<Integer>();
//        for (int i = 0; i < 10; i++) {
//            myCollection.add(i, sc.nextInt());
//        }
        myCollection.add(12);
        myCollection.add(22);
        myCollection.add(32);
        myCollection.add(4);
        myCollection.add(2);
        myCollection.add(12);
        myCollection.add(54);
        myCollection.add(2);
        myCollection.add(5);
        myCollection.add(6);
        for (int j : myCollection) {
            System.out.print(j + "  ");
        }
        System.out.println("");

        List<Integer> newColltection = new LinkedList<>();
        Iterator iter = myCollection.iterator();
        while (iter.hasNext()) {
            int i = (int) iter.next();
            if (i > 5) {
                newColltection.add(i);
            }
            if (i > 20) {
                iter.remove();
            }
        }
        System.out.println("");
        Iterator iter1 = newColltection.iterator();
        System.out.print("newCol - ");
        while (iter1.hasNext()) {
            System.out.print(iter1.next() + "  ");
        }
        System.out.println("");
        System.out.print("myCol - ");
        for (int j : myCollection) {
            System.out.print(j + "  ");
        }
        myCollection.add(2, 1);
        myCollection.add(5, -4);
        myCollection.add(8, -3);
        System.out.println("");
        System.out.print("myCol - ");
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("myCollection[" + i + "] = " + myCollection.get(i));
        }
        myCollection.sort((a,b)-> a.compareTo(b));
        System.out.println("");
        System.out.print("myCol = ");
        for (int i: myCollection) {
            System.out.print(i+ " ");
        }
    }
}
