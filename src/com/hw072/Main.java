package com.hw072;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        System.out.print("Enter 5 words, please - ");
        Scanner scr = new Scanner(System.in);

        String words = scr.nextLine();
        String[] arr = words.split(" ");
        String longest = arr[0];

        for (int i = 0; i < arr.length; i++){
            System.out.println((i + 1) + " word have - " + arr[i].length() + " leters");
            if (longest.length() < arr[i].length()){
                longest = arr[i];
            }
        }

        System.out.println("The longest word - " + longest);
        StringBuilder reverse = new StringBuilder(arr[1]);
        StringBuilder reversed = reverse.reverse();
        System.out.println("Reversed second word - " + reversed);

        System.out.println("------------------------------------");

//        ---------------------------------------------------------------------------------------------------------
//        ---------------------------------------------------------------------------------------------------------

        System.out.print("Enter a sentence that contains the words between more than one space - ");
        Scanner scr2 = new Scanner(System.in);
        String words2 = scr2.nextLine();
        String[] arr2 = words2.split("  ");
        System.out.print("You wrote - ");

        for (int f = 0; f < arr2.length; f++) {
            System.out.print(arr2[f] + " ");
        }

        System.out.println("\n------------------------------------");

//        ---------------------------------------------------------------------------------------------------------
//        ---------------------------------------------------------------------------------------------------------

        System.out.print("Enter some text that contains several occurrences of US currency - ");
        Scanner scr3 = new Scanner(System.in);
        String text =  scr3.nextLine();  //$1'111,111.11
        String pattern = "[$]\\b\\d{1,3}([,']\\d{3})*\\.\\d{2}\\b";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        if (m.find()){
            System.out.println(text.substring(m.start(), m.end()) + " was found in the text");
        }else {
            System.out.println("You wrote something incorrect(");
        }
    }
}
