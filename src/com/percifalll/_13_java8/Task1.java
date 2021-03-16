package com.percifalll._13_java8;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * There is a list of strings list1.
 * Create a new list list2 that has items from
 * list1 and length less than 5 characters (use method removeIf)
 */
public class Task1 {
    public static void main(String[] args) {
        String[] strings = new String[]{
                "gufweohgldfsg",
                "wlg",
                "erlwighlqewf",
                "walfihiwef",
                "fdsf",
                "fwqpierjgfds"
        };


        List<String> list = new LinkedList<>(Arrays.asList(strings));

        List<String> newList = new LinkedList<>(list);
        newList.removeIf(string -> string.length() >= 5);

        System.out.println(list);
        System.out.println(newList);
    }
}
