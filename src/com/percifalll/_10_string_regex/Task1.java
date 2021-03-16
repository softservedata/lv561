package com.percifalll._10_string_regex;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Enter in the console sentence of five words.
 *  display the longest word in the sentence
 *  determine the number of its letters
 *  bring the second word in reverse order
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your string:");
        String string = scanner.nextLine();

        //String string = "gnwle fjlfes lfdeoq sdcas rpwids";
        String[] words = string.split(" ");

        System.out.println(Arrays.toString(words));

        String longestWord = words[0];
        for (String element : words){
            if (element.length() > longestWord.length()){
                longestWord = element;
            }
        }

        System.out.println("The longest word - \"" + longestWord + "\"");
        System.out.println("Its letters count = " + longestWord.length());

        System.out.println("The second word reversed - \"" +
                new StringBuilder(words[1]).reverse().toString()
        );
    }
}
