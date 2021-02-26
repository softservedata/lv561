package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        //Tasks
//Enter the two variables of type String. Determine whether the first variable substring second.
// For example, if you typed «IT» and «IT Academy» you must receive true.
        /*String a = "Java";
        String b = "Java Academy";

        System.out.println(a.equals(b)); //false
        System.out.println(b.contains(a) || a.contains(b));

         */

        /*
        String str1 = a.substring(1, 4);
        String str2 = b.substring(1, 4);
        System.out.println(str1.equals(str2)); //true
         */

// Enter surname, name and patronymic on the console as a variable of type String. Output on the console:
        //surnames and initials
        //name
        //name, middle name and last name
/*

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, type you surname ");
        String surname = br.readLine();
        surname = surname.substring(0, 1).toUpperCase() + surname.substring(1).toLowerCase();
        System.out.println("Please, type you name ");
        String name = br.readLine();
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println("Please, type you middle name ");
        String midname = br.readLine();
        midname = midname.substring(0, 1).toUpperCase() + midname.substring(1).toLowerCase();

        char N1 = name.charAt(0);
        char M1 = midname.charAt(0);

        System.out.println("surnames and initials " + surname + " " + N1 + "." + M1 + ".");
        System.out.println("name " + name);
        System.out.println("name, middle name and last name " + name + " " + midname + " " + surname);

 */


//HomeWork 1
        /*Enter in the console sentence of five words.
        display the longest word in the sentence
        determine the number of its letters
        bring the second word in reverse order
         */
/*
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, type a sentence of five words ");
        String sentence = br1.readLine();

        String[] arrayWords = sentence.split(" ");
        String maxWord = arrayWords[0];
        for (int i = 1; i < arrayWords.length; i++) {
            if (arrayWords[0].length() < arrayWords[i].length()) {
                maxWord = arrayWords[i];
                continue;
            }
        }
        System.out.println("the longest word in the sentence is :\n" + maxWord + " \n determine the number of its letters: " + maxWord.length());
        StringBuilder builder = new StringBuilder(arrayWords[1]);
        builder.reverse();
        System.out.println("the second word in reverse order:\n" + builder.reverse());
    }
    */
//HomeWork 2
    //Enter a sentence that contains the words between more than one space.
    // Convert all spaces, consecutive, one. For example, if we introduce the sentence
    // "I    am      learning     Java   Core», we have to get the "I'm learning Java Core»

        System.out.println("Enter a sentence that contains the words between more than one space ");
        Scanner sc = new Scanner(System.in);
        String newSc = sc.nextLine();
        System.out.println(newSc);
        System.out.println("Enter a sentence that contains the words between:" + newSc);
        String input2 = sc.nextLine();
        System.out.println(input2);
        System.out.println("Convert all spaces, consecutive, one:\n" +
                input2.replaceAll("( +)"," "));
    }

}
