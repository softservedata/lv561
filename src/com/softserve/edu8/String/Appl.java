package com.softserve.edu8.String;

import java.security.spec.ECField;
import java.util.Scanner;

public class Appl {

    public static boolean firstSubSecond (String first, String second) throws Exception{
        if (first.isEmpty() && second.isEmpty()) {
            throw new Exception("Entered words are empty");
        } else {
            return second.contains(first);
        }
    }



    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String first = scanner.nextLine();
    String second = scanner.nextLine();
    scanner.close();

    try {
        System.out.println(firstSubSecond(first, second));
    } catch (Exception e) {
        System.out.println("Entered words are empty");
    }








    }
}
