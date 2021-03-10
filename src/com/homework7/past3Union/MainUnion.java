package com.homework7.past3Union;

import java.util.HashSet;
import java.util.Set;

/*
 *  Write parameterized methods union(Set set1, Set set2)
 *  and intersect(Set set1, Set set2),
 *  realizing the operations of union and intersection of two sets.
 *  Test the operation of these techniques on two pre-filled sets.
 */

public class MainUnion {
    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(1, 2, 3, 4, 5);
        Set<Integer> set2 = Set.of(3, 5, 7, 9);

        Set<Integer> union = new HashSet<Integer>(set1);
        System.out.println("Show union: " + union);
        union.addAll(set2);
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Show intersection: " + intersection);
    }
}


