package com.homework8.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        /*Enter in the console sentence of five words.
        display the longest word in the sentence
        determine the number of its letters
        bring the second word in reverse order
        */


        System.out.println("Enter sentence of five words - ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input);
        System.out.println("\n ----------------------------");

            String[] arrayWords = input.split(" ");
            String maxWord = arrayWords[0];
            for(int i = 1; i < arrayWords.length; i++){
                if(arrayWords[0].length() < arrayWords[i].length()){
                    maxWord = arrayWords[i];
                continue;}
            }
            System.out.println("the longest word in the sentence:\n" + maxWord +
                    "\n ----------------------------");
            StringBuilder builder = new StringBuilder(arrayWords[1]);
            builder.reverse();
            System.out.println("the second word in reverse order:\n" + builder.reverse() +
                    "\n ----------------------------");

    /*Enter a sentence that contains the words between more than one space.
      Convert all spaces, consecutive, one. For example,
      if we introduce the sentence "I    am      learning     Java   Core»,
      we have to get the "I'm learning Java Core»
    */
        System.out.println("Enter a sentence that contains the words between:");
        String input2 = sc.nextLine();
        System.out.println(input2 +  "\n ----------------------------");
        System.out.println("Convert all spaces, consecutive, one:\n" +
                input2.replaceAll("( +)"," ") +
                "\n ----------------------------");
        }
        /*
         * Implement a pattern for US currency: the first symbol "$",
         * then any number of digits, dot and two digits after the dot.
         * Enter the text from the console that contains several occurrences of US currency.
         * Display all occurrences on the screen.
         */
    class Implement{
        public static void implement(){
            String pattern = "\\$(\\d*)(\\.\\d{2})";
            Pattern p = Pattern.compile(pattern);
            List<String> list = new ArrayList<>();
            list.add("$89386.07");
            list.add("$0374.00");
            list.add("$01.0");
            list.add("$2");
            list.add("");

            List<String> trueList = new ArrayList<>();
            List<String> falceList = new ArrayList<>();
            for(String num : list){
                if(p.matcher(num).matches()){
                    trueList.add(num);
                }else{
                    falceList.add(num);
                }
                System.out.println("Print trueList:");
                for(String num : trueList){
                    System.out.println("\n" + num);
                }
                System.out.println("Print falceList:");
                for(String num : falceList){
                    System.out.println("\n" + num);
                }
            }
        }
    }
}
