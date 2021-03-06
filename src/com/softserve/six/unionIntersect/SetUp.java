package com.softserve.six.unionIntersect;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetUp {
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> res = new HashSet<>(set1);
        res.addAll(set2);
        return res;
    }
    public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> res = new HashSet<>(set1);
        res.retainAll(set2);
        return res;
    }

    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        Random rnd = new Random();
        for (int i = 0; i < 20; i++) {
            s1.add(rnd.nextInt(20));
        }
        System.out.println("Set1: " + s1);
        Set<Integer> s2 = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            s2.add(rnd.nextInt(15));
        }
        System.out.println("Set2: " + s2);
        System.out.println(".....");
        System.out.println("Union - " + SetUp.union(s1, s2));
        System.out.println(".....");
        System.out.println("Intersect - " + SetUp.intersect(s1, s2));

    }
}
