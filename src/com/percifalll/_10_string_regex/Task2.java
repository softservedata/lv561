package com.percifalll._10_string_regex;

import java.util.Scanner;

/**
 * Enter a sentence that contains the words between more than one space.
 * Convert all spaces, consecutive, one.
 * For example, if we introduce the sentence
 *      "I    am      learning     Java   Core»,
 * we have to get the
 *      "I'm learning Java Core»
 */

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your string:");
        String string = scanner.nextLine();

        System.out.println(
                "Changed string:\n" +
                string.replaceAll("[\\s]+", " ")
        );
    }
}
