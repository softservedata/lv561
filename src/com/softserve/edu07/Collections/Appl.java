package com.softserve.edu07.Collections;

import java.security.spec.ECField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Appl {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> myCollection = new ArrayList<>();

        // random adding new integer to myCollection
        for (int i = 0 ; i < 10; i++) {
            myCollection.add(random.nextInt(100));
        }

        List<Integer> newCollection = new ArrayList<>();
        for (int i = 5; i < myCollection.size(); i++) {
            newCollection.add(myCollection.get(i));
        }

        System.out.println(newCollection.toString());   // printing  array

        Iterator<Integer> iterator = newCollection.iterator();  //removing from list element with value > 20
        while(iterator.hasNext()) {
            if (iterator.next() >= 20) {
                iterator.remove();
            }
        }
        try {
            newCollection.add(2,1);
            newCollection.add(8,-3);
            newCollection.add(5,-4);
        } catch (Exception e) {}


        for (int i = 0; i < newCollection.size(); i++) {
            System.out.println(newCollection.size());
            System.out.println("position "+i+" value of element "+newCollection.get(i));
        }



    }
}
