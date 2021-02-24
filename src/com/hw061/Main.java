package com.hw061;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> myCollection = new ArrayList<>(10);
        ArrayList<Integer> newCollection = new ArrayList<>(10);
        ArrayList<Integer> newMyCollection = new ArrayList<>(10);

        for (int n = 0; n < 10; n++) {
            Scanner scr = new Scanner(System.in);
            int s = scr.nextInt();
            myCollection.add(s);
        }

        System.out.println("myCollection - " + myCollection);

        Iterator<Integer> iterator = myCollection.iterator();
        while(iterator.hasNext()) {
            int current = iterator.next();
            if (current > 5) {
                newCollection.add(current);
            }
        }

        Iterator<Integer> iterator1 = myCollection.iterator();
        while(iterator1.hasNext()) {
            int current1 = iterator1.next();
            if (current1 > 20){
                iterator1.remove();
            }
        }

        System.out.println("newCollection - " + newCollection);
        System.out.println("result - " + myCollection);
        System.out.println("-------------------------------------------");

        for (int k = 0; k < 10; k++){
            if (k == 1){
                newMyCollection.add(1);
            }else if (k == 7){
                newMyCollection.add(-3);
            }else if (k == 4){
                newMyCollection.add(-4);
            }else {
                newMyCollection.add(0);
            }
        }

        System.out.println("newMyCollection - " + newMyCollection);

        System.out.println("position - 2       value of element - " + newMyCollection.get(1));
        System.out.println("position - 8       value of element - " + newMyCollection.get(7));
        System.out.println("position - 5       value of element - " + newMyCollection.get(4));

        Collections.sort(newMyCollection);
        System.out.println("newMyCollection - " + newMyCollection);

    }
}