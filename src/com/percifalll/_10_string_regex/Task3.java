package com.percifalll._10_string_regex;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;

/**
 * Implement a pattern for US currency:
 *      the first symbol "$",
 *      then any number of digits,
 *      dot and two digits after the dot.
 *
 * Enter the text from the console that contains several
 * occurrences of US currency.
 *
 * Display all occurrences on the screen.
 */

public class Task3 {
    public static void main(String[] args) {
        String regex = "\\$(\\s?)([0-9]+)\\.([0-9]{2})";

        Pattern pattern =  Pattern.compile(regex);

        System.out.println("Enter your text:");
        String text = new Scanner(System.in).nextLine();

        Matcher matcher = pattern.matcher(text);

        List<String> listOfCurrencies = new LinkedList<>();

        if (matcher.find()){
            matcher.reset();

            while(matcher.find()) {
                listOfCurrencies.add( matcher.group() );
            }

            System.out.println("Matched currencies:");
            for (String el : listOfCurrencies){
                System.out.println(el);
            }
        } else {
            System.out.println("No matches found");
        }
    }
}
