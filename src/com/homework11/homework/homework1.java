package com.homework11.homework;

  /*
   * 1. There is a list of strings list1.
   * Create a new list list2 that has items from list1
   * and length less than 5 characters (use method removeIf)
   */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class homework1 {
    public static void main(String[] args){
        List<String> list1 = Arrays.asList("first", "second", "third", "fifth", "");
        List<String> list2 = list1.stream()
               // .filter(list -> list1.length() < 5)
              //  .filter( )
                .collect(Collectors.toList());

    }
}
