package com.percifalll._09_collections.homework;

import java.util.HashSet;
import java.util.Set;

/**
 * Write parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2),
 * realizing the operations of union and intersection of two sets.
 *
 * Test the operation of these techniques on two pre-filled sets.
 */
public class Task1 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i = 0; i < 10; i++){
            set1.add(i);
            set2.add(i + 7);
        }

        System.out.println("set1 = " + set1 + " size = " + set1.size());
        System.out.println("set2 = " + set2 + " size = " + set2.size());

        // 1.1
        Set<Integer> unionSet = union(set1, set2);

        System.out.println("union set = " + unionSet  + " size = " + unionSet.size());

        // 1.2
        Set<Integer> intersectionSet = intersect(set1, set2);

        System.out.println("intersection set = " + intersectionSet  + " size = " + intersectionSet.size());


    }

    public static Set<Integer> union (Set<Integer> firstSet, Set<Integer> secondSet){
        Set<Integer> result = new HashSet<>(firstSet);

        result.addAll(secondSet);

        return result;
    }

    public static Set<Integer> intersect(Set<Integer> firstSet, Set<Integer> secondSet){
        Set<Integer> result = new HashSet<>();

        for (Integer fElement : firstSet){
            for (Integer sElemet : secondSet){
                if ( fElement.equals(sElemet) ){
                    result.add(fElement);
                }
            }
        }

        return result;
    }
}
