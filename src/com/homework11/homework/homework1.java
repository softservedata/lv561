package com.homework11.homework;

  /*
   * 1. There is a list of strings list1.
   * Create a new list list2 that has items from list1
   * and length less than 5 characters (use method removeIf)
   */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class homework1 {
    public static void main(String[] args){
        List<String> list1 = new ArrayList<>(Arrays.asList("Tom", "sim" , "Kiev", "Ljubljana", "Autumn"));;
        System.out.println(list1);
        List<String> list2 = new ArrayList<>();
        list1.removeIf(x -> x.length()<3);
        list2 = list1;
        System.out.println(list2);


    }
}
